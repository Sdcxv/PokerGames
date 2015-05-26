package com.sdcxv.pokergames.roles;

import com.sdcxv.pokergames.enums.PID;
import com.sdcxv.pokergames.enums.Points;
import com.sdcxv.pokergames.enums.Suits;
import com.sdcxv.pokergames.poker.Hand;

/**
 * Created by Sdcxv on 2015/5/25.
 * �����
 */
public class Player {
    private Hand hand = new Hand();

    private PID pId;

    public PID getpId() {
        return pId;
    }

    //��ҳ�ʼ��
    public void initPlayer(PID p) {
        hand.initPoker();
        pId = p;
    }

    //չʾ����
    public void showDown() {
        hand.showPocket(pId);
    }

    //�鿴���յ����Ʋ���������
    public void check(Suits suit, Points point) {
        hand.joinHand(suit, point);
    }
}
