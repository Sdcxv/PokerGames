package com.sdcxv.pokergames.poker;

/**
 * Created by Sdcxv on 2015/5/25.
 */
public abstract class AbstractPoker implements IPokerable {
    /**
     * 用于存放牌组的二维布尔类型数组，4种花色（列，suit），13种数字（行，num）共52张
     * true表示该位置有这张牌
     * false表示该位置无这张牌
     */
    protected boolean[][] poker = new boolean[13][4];

    public boolean[][] getPoker() {
        return poker;
    }

    //显示牌组中的所有牌的情况
    @Override
    public void checkPoker() {
        for (boolean[] point : poker) {
            for (boolean suit : point) {
                System.out.print(suit + "\t");
            }
        }
    }
}
