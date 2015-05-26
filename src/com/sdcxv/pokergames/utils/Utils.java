package com.sdcxv.pokergames.utils;

import com.sdcxv.pokergames.enums.Points;
import com.sdcxv.pokergames.enums.Suits;

/**
 * Created by Sdcxv on 2015/5/25.
 * 工具类，点数花色与数字之间的转换
 */
public class Utils {
    private Utils() {
    }

    //花色转数字
    public static int suitToIntger(Suits suit) {
        switch (suit) {
            case spade:
                return 0;
            case hearts:
                return 1;
            case diamond:
                return 2;
            case club:
                return 3;
            default: {
                System.out.println("suitToIntger error!");
                return -1;
            }
        }
    }

    //数字转花色
    public static Suits intgerToSuit(int intger) {
        switch (intger) {
            case 0:
                return Suits.spade;
            case 1:
                return Suits.hearts;
            case 2:
                return Suits.diamond;
            case 3:
                return Suits.club;
            default: {
                System.out.println("intgerToSuit error!");
                return Suits.error;
            }
        }
    }

    //点数转数字
    public static int pointToIntger(Points point){
        switch (point) {
            case ace:
                return 0;
            case two:
                return 1;
            case three:
                return 2;
            case four:
                return 3;
            case five:
                return 4;
            case six:
                return 5;
            case seven:
                return 6;
            case eight:
                return 7;
            case nine:
                return 8;
            case ten:
                return 9;
            case jack:
                return 10;
            case queen:
                return 11;
            case king:
                return 12;
            default: {
                System.out.println("pointToIntger error!");
                return -1;
            }
        }
    }

    //数字转点数
    public static Points intgerToPoint(int intger) {
        switch (intger) {
            case 0:
                return Points.ace;
            case 1:
                return Points.two;
            case 2:
                return Points.three;
            case 3:
                return Points.four;
            case 4:
                return Points.five;
            case 5:
                return Points.six;
            case 6:
                return Points.seven;
            case 7:
                return Points.eight;
            case 8:
                return Points.nine;
            case 9:
                return Points.ten;
            case 10:
                return Points.jack;
            case 11:
                return Points.queen;
            case 12:
                return Points.king;
            default: {
                System.out.println("intgerToPoint error!");
                return Points.error;
            }
        }
    }
}
