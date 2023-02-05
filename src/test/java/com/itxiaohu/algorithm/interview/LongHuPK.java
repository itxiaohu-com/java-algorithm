package com.itxiaohu.algorithm.interview;

/**
 * 龙虎斗(二维数组+贪心算法)
 *
 * <p>更多内容参看<a href="https://itxiaohu.com" target="_blank"><b>IT小胡频道</b></a></p>
 * @author IT小胡
 */
public class LongHuPK {

    private static final char[] LONG = {'a', 'b', 'c'};
    private static final char[] HU = {'x', 'y', 'z'};

    private static final int LENGTH = 3;
    private static final int[][] MATCH = new int[LENGTH][LENGTH];

    private static final int FLAG_BAN_MATCH = -1; //禁止匹配
    private static final int FLAG_TO_MATCH = 0;   //待匹配
    private static final int FLAG_MATCHED = 1;    //已匹配

    public static void main(String[] args) {
        // 初始化
        init();
        // 对阵匹配
        match();
        // 打印结果
        print();
    }

    /**
     * 采用二维数组记录对阵匹配规则及匹配结果
     *
     * i\j  x   y   z
     * -- -- -- -- --
     * a | -1   0   0
     * b |  0   0   0
     * c | -1   0  -1
     */
    private static void init() {
        for(int i = 0; i < LENGTH; i++){
            for(int j = 0; j < LENGTH; j++){
                if(('a' == LONG[i] && 'x' == HU[j]) ||
                        ('c' == LONG[i] && 'x' == HU[j]) ||
                        ('c' == LONG[i] && 'z' == HU[j])) {
                    MATCH[i][j] = FLAG_BAN_MATCH;
                }else {
                    MATCH[i][j] = FLAG_TO_MATCH;
                }
            }
        }
    }

    private static void match() {
        for(int i = 0; i < LENGTH; i++) {
            int j = findJ(i);
            MATCH[i][j] = FLAG_MATCHED;
            markJ(i, j);
        }
    }

    /**
     * 使用贪心算法寻找最优列
     */
    private static int findJ(int startI) {
        int resultJ = 0;
        int maxCount = 0;
        for(int j = 0; j < LENGTH; j++) {
            if(MATCH[startI][j] == FLAG_BAN_MATCH) {
                continue;
            }

            if(startI == LENGTH -1) {
                return j;
            }

            int count = 0;
            for(int i = startI + 1; i < LENGTH; i++) {
                if(MATCH[i][j] == FLAG_BAN_MATCH) {
                    count++;
                }
            }
            if(count > maxCount) {
                maxCount = count;
                resultJ = j;
            }

        }
        return resultJ;
    }

    /**
     * 把剩余行中已匹配的列标注为已批配
     */
    private static void markJ(int startI, int targetJ) {
        for(int i = startI + 1; i < LENGTH; i++) {
            if(MATCH[i][targetJ] == FLAG_TO_MATCH) {
                MATCH[i][targetJ] = FLAG_BAN_MATCH;
            }
        }
    }

    private static void print() {
        for(int i = 0; i < LENGTH; i++){
            for(int j = 0; j < LENGTH; j++){
                if(MATCH[i][j] == FLAG_MATCHED) {
                    System.out.printf("%s VS %s\t", LONG[i], HU[j]);
                }
            }
            System.out.println();
        }
    }

}
