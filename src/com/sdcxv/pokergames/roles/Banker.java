package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.poker.Deck;

import java.security.SecureRandom;

import static com.sdcxv.pokergames.utils.Utils.intgerToPoint;
import static com.sdcxv.pokergames.utils.Utils.intgerToSuit;

/**
 * Created by Sdcxv on 2015/5/25.
 * <p>
 * ׯ����
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

    private Deck deck = new Deck();
    private SecureRandom secureRandom = new SecureRandom();
    private int counter = 0;
    private Player playerBuffer = new Player();

    //ׯ�ҳ�ʼ��
    public void initBanker() {
        deck.initPoker();
    }

    //��ӡ����
    public void checkDeck() {
        deck.checkPoker();
    }

    //ׯ�Ҹ���Ҷ��з���
    public void deal(Players players) {
        int r = secureRandom.nextInt(52);
        //��δ����
        if (deck.checkDeck(intgerToSuit(r % 4), intgerToPoint(r / 4))) {
            playerBuffer = players.getPlayer();
            //��ȡ�õ����Ϊ���E
            if (playerBuffer.getpId() == PID.E) {
                players.setPlayer(playerBuffer);
                playerBuffer = players.getPlayer();
            }
            deck.deal(intgerToSuit(r % 4), intgerToPoint(r / 4), playerBuffer);
            players.setPlayer(playerBuffer);
            counter++;
        } else {
            //���ѷ�����δ����
            if (counter < 52)
                deal(players);
        }
    }
}
