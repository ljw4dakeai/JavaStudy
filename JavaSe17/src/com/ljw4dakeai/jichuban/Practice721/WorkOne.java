package com.ljw4dakeai.jichuban.Practice721;

import java.util.ArrayList;

/**
 * @author ZJH
 * 21
 * 定义一个标准的学生类, 里面有三个属性,姓名,学科 ,分数,
 *
 *
 *
 * 求分数的最大值,并打印出来
 */
public class WorkOne {
        public static void main(String[] args) {
                Score zjhMath = new Score("邹家豪", "数学", 100);
                Score zjhEnglish = new Score("邹家豪", "英语", 70);
                Score zjhChinese = new Score("邹家豪", "语文", 90);

                ArrayList<Score> scores = new ArrayList<>();
                scores.add(zjhMath);
                scores.add(zjhEnglish);
                scores.add(zjhChinese);

                int max = scores.get(1).getScore();
                for (Score score : scores) {
                        max = max > score.getScore() ? max : score.getScore();
                }

                System.out.println("最高分为:" + max);

        }
}

class Score{
        private String name;
        private String garden;
        private int score;

        public Score(String name, String garden, int score) {
                this.name = name;
                this.garden = garden;
                this.score = score;
        }

        public Score() {
        }

        @Override
        public String toString() {
                return "Score{" +
                        "name='" + name + '\'' +
                        ", garden='" + garden + '\'' +
                        ", score=" + score +
                        '}';
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getGarden() {
                return garden;
        }

        public void setGarden(String garden) {
                this.garden = garden;
        }

        public int getScore() {
                return score;
        }

        public void setScore(int score) {
                this.score = score;
        }
}
