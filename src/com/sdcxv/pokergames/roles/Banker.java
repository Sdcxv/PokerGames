package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.poker.Deck;

import java.security.SecureRandom;

import static com.sdcxv.pokergames.utils.Utils.intgerToPoint;
import static com.sdcxv.pokergames.utils.Utils.intgerToSuit;

/**
 * Created by Sdcxv on 2015/5/25.
 * 庄家类
 * One Banker only
 * Lazy initialization
 */
public class Banker {

    private static Banker ourInstance = new Banker();

    public static Banker getInstance() {
        return ourInstance;
    }

    private Banker() {
    }

    //牌组
    private Deck deck = new Deck();
    //真随机数（？）发生器
    private SecureRandom secureRandom = new SecureRandom();
    //计数器，记录已发出的牌数
    private int counter = 0;
    //当前玩家缓冲
    private Player playerBuffer = new Player();

    //庄家初始化
    public void initBanker() {
        deck.initPoker();
    }

    //打印牌组
    public void checkDeck() {
        deck.checkPoker();
    }

    //庄家给玩家队列发牌
    public void deal(Players players) {
        //随机取得一张牌的序号
        int r = secureRandom.nextInt(52);
        //牌未发出
        if (deck.checkDeck(intgerToSuit(r % 4), intgerToPoint(r / 4))) {
            //玩家出队
            playerBuffer = players.getPlayer();
            //发牌给玩家
            deck.deal(intgerToSuit(r % 4), intgerToPoint(r / 4), playerBuffer);
            //玩家入队
            players.setPlayer(playerBuffer);
            //计数器自增
            counter++;
        } else {
            //牌已发出且未发完
            if (counter < 52)
                deal(players);
        }
    }
}
