package com.ljw4dakeai.jinjieban.chapter04.HomeWorkCode;

import java.util.regex.Pattern;

/**
 * @author ZJH
 */
public class WorkFour {
    public static void main(String[] args) {
        final String content = "先帝1创业2未半而中道3崩殂4，今5天下三分6，益州疲弊7，此8诚危急存亡之秋也。然9侍卫之臣不懈于内，忠志之士忘身10于外者，盖追先帝之殊遇11，欲报之于陛下也。诚宜12开张圣听13，以光14先帝遗德，恢弘15志士之气，不宜妄自菲薄16，引喻失义17，以塞忠谏之路也18。\n" +
                "宫中府中，俱为一体19；陟罚臧否20，不宜异同：若有作奸犯科21及为忠善者22，宜付有司23论其刑赏24，以昭陛下平明之理25；不宜偏私26，使内外异法也27。\n" +
                "侍中、侍郎郭攸之、费祎、董允等，此皆良实，志虑忠纯28，是以先帝简拔以遗陛下29：愚以为宫中之事，事无大小，悉以咨之30，然后施行，必能裨补阙漏31，有所广益32。";

        System.out.println(content.replaceAll("\\d", "*"));

    }
}
