package com.sdcxv.pokergames.poker;

/**
 * Created by Sdcxv on 2015/5/25.
 */
public abstract class AbstractPoker implements IPokerable {
    /**
     * ���ڴ������Ķ�ά�����������飬4�ֻ�ɫ���У�suit����13�����֣��У�num����52��
     * true��ʾ��λ����������
     * false��ʾ��λ����������
     */
    protected boolean[][] poker = new boolean[13][4];

    public boolean[][] getPoker() {
        return poker;
    }

    //��ʾ�����е������Ƶ����
    @Override
    public void checkPoker() {
        for (boolean[] point : poker) {
            for (boolean suit : point) {
                System.out.print(suit + "\t");
            }
        }
    }
}
