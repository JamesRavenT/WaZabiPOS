package com.wabizabi.wazabipos.Utilities.Testing;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class DataSetA implements DataSet {
    public static void insertInto(List<List<String>> transactionsTB){

        List<String> t1 = new ArrayList<>(List.of("4 Seasons", "Gyudon"));
        List<String> t2 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen"));
        List<String> t3 = new ArrayList<>(List.of("4 Seasons", "4 Seasons", "Tonkotsu Ramen", "Rainbow Roll", "Chocolate Cake"));
        List<String> t4 = new ArrayList<>(List.of("Rainbow Roll", "Gyudon", "Unagi", "Rainbow Roll", "Tonkotsu Ramen", "4 Seasons"));
        List<String> t5 = new ArrayList<>(List.of("Tonkotsu Ramen", "Salad Wrap"));
        List<String> t6 = new ArrayList<>(List.of("Chocolate Cake", "Unagi", "Tonkotsu Ramen", "Rainbow Roll", "4 Seasons", "Rainbow Roll", "4 Seasons"));
        List<String> t7 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Unagi"));
        List<String> t8 = new ArrayList<>(List.of("Chocolate Cake", "Unagi", "Rainbow Roll", "Gyudon", "Chocolate Cake", "Unagi"));
        List<String> t9 = new ArrayList<>(List.of("Rainbow Roll", "Unagi"));
        List<String> t10 = new ArrayList<>(List.of("4 Seasons", "Gyudon", "Tonkotsu Ramen"));
        List<String> t11 = new ArrayList<>(List.of("Unagi", "Rainbow Roll"));
        List<String> t12 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t13 = new ArrayList<>(List.of("All Fried Sushi Platter", "Unagi", "Salad Wrap", "Unagi"));
        List<String> t14 = new ArrayList<>(List.of("Unagi", "Salad Wrap"));
        List<String> t15 = new ArrayList<>(List.of("Rainbow Roll", "Chocolate Cake"));
        List<String> t16 = new ArrayList<>(List.of("4 Seasons", "Rainbow Roll", "Chocolate Cake", "4 Seasons", "All Fried Sushi Platter", "All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t17 = new ArrayList<>(List.of("4 Seasons"));
        List<String> t18 = new ArrayList<>(List.of("Chocolate Cake", "Salad Wrap", "Salad Wrap", "Rainbow Roll", "Unagi", "Salad Wrap"));
        List<String> t19 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen"));
        List<String> t20 = new ArrayList<>(List.of("Tonkotsu Ramen", "Chocolate Cake"));
        List<String> t21 = new ArrayList<>(List.of("Tonkotsu Ramen", "Chocolate Cake", "Salad Wrap", "4 Seasons", "Unagi", "Rainbow Roll", "Chocolate Cake"));
        List<String> t22 = new ArrayList<>(List.of("4 Seasons", "Gyudon", "Tonkotsu Ramen", "Gyudon", "All Fried Sushi Platter"));
        List<String> t23 = new ArrayList<>(List.of("Tonkotsu Ramen"));
        List<String> t24 = new ArrayList<>(List.of("Gyudon", "Gyudon", "All Fried Sushi Platter", "Gyudon", "Chocolate Cake"));
        List<String> t25 = new ArrayList<>(List.of("4 Seasons", "Gyudon"));
        List<String> t26 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen"));
        List<String> t27 = new ArrayList<>(List.of("Chocolate Cake", "Gyudon", "Salad Wrap", "Salad Wrap", "Tonkotsu Ramen", "Unagi", "Gyudon"));
        List<String> t28 = new ArrayList<>(List.of("Chocolate Cake", "Salad Wrap", "Tonkotsu Ramen", "Chocolate Cake"));
        List<String> t29 = new ArrayList<>(List.of("Chocolate Cake", "Unagi", "Salad Wrap", "Salad Wrap", "Gyudon"));
        List<String> t30 = new ArrayList<>(List.of("Rainbow Roll", "Tonkotsu Ramen", "Unagi"));
        List<String> t31 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Tonkotsu Ramen", "Tonkotsu Ramen", "Salad Wrap"));
        List<String> t32 = new ArrayList<>(List.of("Unagi", "Unagi", "4 Seasons", "All Fried Sushi Platter", "4 Seasons", "Tonkotsu Ramen"));
        List<String> t33 = new ArrayList<>(List.of("Rainbow Roll", "Salad Wrap"));
        List<String> t34 = new ArrayList<>(List.of("Tonkotsu Ramen", "Unagi"));
        List<String> t35 = new ArrayList<>(List.of("Gyudon", "4 Seasons", "Tonkotsu Ramen", "Unagi", "Tonkotsu Ramen"));
        List<String> t36 = new ArrayList<>(List.of("4 Seasons", "Gyudon"));
        List<String> t37 = new ArrayList<>(List.of("Unagi", "Salad Wrap"));
        List<String> t38 = new ArrayList<>(List.of("Rainbow Roll", "Rainbow Roll", "All Fried Sushi Platter"));
        List<String> t39 = new ArrayList<>(List.of("Tonkotsu Ramen", "Rainbow Roll", "Gyudon"));
        List<String> t40 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "Unagi"));
        List<String> t41 = new ArrayList<>(List.of("Rainbow Roll", "Gyudon"));
        List<String> t42 = new ArrayList<>(List.of("Rainbow Roll", "Salad Wrap", "Unagi", "4 Seasons", "Gyudon", "All Fried Sushi Platter", "Chocolate Cake"));
        List<String> t43 = new ArrayList<>(List.of("Unagi"));
        List<String> t44 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tonkotsu Ramen", "Unagi", "Unagi"));
        List<String> t45 = new ArrayList<>(List.of("4 Seasons", "Unagi", "Unagi", "Unagi", "Unagi", "4 Seasons"));
        List<String> t46 = new ArrayList<>(List.of("Tonkotsu Ramen", "Tonkotsu Ramen", "Rainbow Roll", "Unagi", "Rainbow Roll", "Tonkotsu Ramen", "All Fried Sushi Platter"));
        List<String> t47 = new ArrayList<>(List.of("4 Seasons"));
        List<String> t48 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tonkotsu Ramen", "All Fried Sushi Platter", "Unagi", "Unagi"));
        List<String> t49 = new ArrayList<>(List.of("All Fried Sushi Platter", "Unagi", "All Fried Sushi Platter"));
        List<String> t50 = new ArrayList<>(List.of("Rainbow Roll", "Chocolate Cake", "Tonkotsu Ramen"));
        List<String> t51 = new ArrayList<>(List.of("Gyudon", "Chocolate Cake", "Salad Wrap", "Rainbow Roll", "Tonkotsu Ramen"));
        List<String> t52 = new ArrayList<>(List.of("Tonkotsu Ramen", "Unagi", "Salad Wrap", "4 Seasons", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t53 = new ArrayList<>(List.of("Rainbow Roll", "Unagi"));
        List<String> t54 = new ArrayList<>(List.of("Salad Wrap", "4 Seasons", "4 Seasons", "All Fried Sushi Platter", "Rainbow Roll"));
        List<String> t55 = new ArrayList<>(List.of("Unagi", "Rainbow Roll", "Chocolate Cake", "Gyudon", "Tonkotsu Ramen", "Unagi", "Rainbow Roll"));
        List<String> t56 = new ArrayList<>(List.of("Tonkotsu Ramen", "Chocolate Cake", "All Fried Sushi Platter", "Tonkotsu Ramen"));
        List<String> t57 = new ArrayList<>(List.of("4 Seasons", "4 Seasons", "Chocolate Cake"));
        List<String> t58 = new ArrayList<>(List.of("Unagi", "Salad Wrap"));
        List<String> t59 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter", "4 Seasons", "Chocolate Cake"));
        List<String> t60 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t61 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter", "Salad Wrap", "Rainbow Roll"));
        List<String> t62 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t63 = new ArrayList<>(List.of("Gyudon", "All Fried Sushi Platter", "4 Seasons", "All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t64 = new ArrayList<>(List.of("Chocolate Cake", "Rainbow Roll", "Chocolate Cake", "Unagi", "Salad Wrap"));
        List<String> t65 = new ArrayList<>(List.of("Salad Wrap", "Tonkotsu Ramen"));
        List<String> t66 = new ArrayList<>(List.of("Gyudon", "Unagi", "Salad Wrap", "Chocolate Cake"));
        List<String> t67 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter"));
        List<String> t68 = new ArrayList<>(List.of("4 Seasons", "Rainbow Roll", "Unagi", "Salad Wrap", "All Fried Sushi Platter", "Salad Wrap", "Tonkotsu Ramen"));
        List<String> t69 = new ArrayList<>(List.of("Gyudon", "Rainbow Roll", "4 Seasons", "Rainbow Roll", "4 Seasons", "All Fried Sushi Platter"));
        List<String> t70 = new ArrayList<>(List.of("Chocolate Cake", "Rainbow Roll", "Gyudon"));
        List<String> t71 = new ArrayList<>(List.of("Tonkotsu Ramen", "Unagi", "Chocolate Cake", "Chocolate Cake", "Gyudon"));
        List<String> t72 = new ArrayList<>(List.of("Gyudon", "Unagi", "Tonkotsu Ramen", "Salad Wrap", "Gyudon", "Tonkotsu Ramen", "Unagi"));
        List<String> t73 = new ArrayList<>(List.of("Rainbow Roll", "All Fried Sushi Platter", "Salad Wrap"));
        List<String> t74 = new ArrayList<>(List.of("4 Seasons", "Gyudon", "All Fried Sushi Platter", "Unagi", "4 Seasons", "Rainbow Roll"));
        List<String> t75 = new ArrayList<>(List.of("Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t76 = new ArrayList<>(List.of("Rainbow Roll", "Unagi"));
        List<String> t77 = new ArrayList<>(List.of("Rainbow Roll", "4 Seasons"));
        List<String> t78 = new ArrayList<>(List.of("4 Seasons", "Unagi", "Salad Wrap", "Tonkotsu Ramen", "Unagi"));
        List<String> t79 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen", "All Fried Sushi Platter", "Tonkotsu Ramen", "Tonkotsu Ramen", "Chocolate Cake"));
        List<String> t80 = new ArrayList<>(List.of("Unagi", "Rainbow Roll", "Gyudon", "Gyudon", "Chocolate Cake", "Rainbow Roll"));
        List<String> t81 = new ArrayList<>(List.of("Chocolate Cake", "All Fried Sushi Platter", "Tonkotsu Ramen", "All Fried Sushi Platter", "Salad Wrap"));
        List<String> t82 = new ArrayList<>(List.of("Gyudon"));
        List<String> t83 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter", "Unagi", "Chocolate Cake", "Tonkotsu Ramen", "Chocolate Cake"));
        List<String> t84 = new ArrayList<>(List.of("Tonkotsu Ramen", "Salad Wrap", "Unagi", "Rainbow Roll", "Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t85 = new ArrayList<>(List.of("Rainbow Roll", "Tonkotsu Ramen", "Unagi", "Gyudon"));
        List<String> t86 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap", "4 Seasons", "Gyudon"));
        List<String> t87 = new ArrayList<>(List.of("Tonkotsu Ramen", "Unagi"));
        List<String> t88 = new ArrayList<>(List.of("4 Seasons", "Chocolate Cake", "Salad Wrap", "Rainbow Roll", "All Fried Sushi Platter", "Rainbow Roll", "Unagi"));
        List<String> t89 = new ArrayList<>(List.of("Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t90 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t91 = new ArrayList<>(List.of("4 Seasons", "Gyudon", "4 Seasons", "Chocolate Cake", "Chocolate Cake"));
        List<String> t92 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "All Fried Sushi Platter", "Rainbow Roll", "Gyudon", "Unagi"));
        List<String> t93 = new ArrayList<>(List.of("Gyudon", "4 Seasons", "Rainbow Roll", "Salad Wrap", "Chocolate Cake", "4 Seasons", "Gyudon"));
        List<String> t94 = new ArrayList<>(List.of("Unagi", "Salad Wrap", "4 Seasons", "Unagi", "4 Seasons", "Gyudon", "Tonkotsu Ramen"));
        List<String> t95 = new ArrayList<>(List.of("Tonkotsu Ramen"));
        List<String> t96 = new ArrayList<>(List.of("Unagi", "Chocolate Cake", "Rainbow Roll"));
        List<String> t97 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t98 = new ArrayList<>(List.of("4 Seasons"));
        List<String> t99 = new ArrayList<>(List.of("All Fried Sushi Platter", "Unagi", "Unagi", "Tonkotsu Ramen", "Gyudon"));
        List<String> t100 = new ArrayList<>(List.of("Rainbow Roll", "Salad Wrap", "Salad Wrap"));
        List<String> t101 = new ArrayList<>(List.of("Unagi", "Chocolate Cake"));
        List<String> t102 = new ArrayList<>(List.of("4 Seasons"));
        List<String> t103 = new ArrayList<>(List.of("Rainbow Roll", "Unagi"));
        List<String> t104 = new ArrayList<>(List.of("All Fried Sushi Platter", "Rainbow Roll"));
        List<String> t105 = new ArrayList<>(List.of("Tonkotsu Ramen", "Gyudon", "4 Seasons", "Gyudon", "All Fried Sushi Platter"));
        List<String> t106 = new ArrayList<>(List.of("Unagi"));
        List<String> t107 = new ArrayList<>(List.of("4 Seasons", "Tonkotsu Ramen"));
        List<String> t108 = new ArrayList<>(List.of("Unagi"));
        List<String> t109 = new ArrayList<>(List.of("Tonkotsu Ramen", "Salad Wrap", "Chocolate Cake"));
        List<String> t110 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter"));
        List<String> t111 = new ArrayList<>(List.of("Unagi", "Unagi", "Rainbow Roll", "All Fried Sushi Platter", "Unagi", "Gyudon"));
        List<String> t112 = new ArrayList<>(List.of("Salad Wrap", "Rainbow Roll", "Rainbow Roll", "Unagi", "Unagi", "Rainbow Roll"));
        List<String> t113 = new ArrayList<>(List.of("Tonkotsu Ramen", "Unagi", "Tonkotsu Ramen"));
        List<String> t114 = new ArrayList<>(List.of("Unagi", "Unagi"));
        List<String> t115 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "Unagi", "Gyudon", "Gyudon", "Rainbow Roll", "Salad Wrap"));
        List<String> t116 = new ArrayList<>(List.of("All Fried Sushi Platter", "Rainbow Roll", "Chocolate Cake"));
        List<String> t117 = new ArrayList<>(List.of("Salad Wrap", "Rainbow Roll", "Unagi", "All Fried Sushi Platter", "Chocolate Cake"));
        List<String> t118 = new ArrayList<>(List.of("Gyudon", "Chocolate Cake"));
        List<String> t119 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Salad Wrap", "Unagi", "Rainbow Roll"));
        List<String> t120 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "Tonkotsu Ramen"));
        List<String> t121 = new ArrayList<>(List.of("Tonkotsu Ramen", "All Fried Sushi Platter"));
        List<String> t122 = new ArrayList<>(List.of("Unagi", "Unagi"));
        List<String> t123 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t124 = new ArrayList<>(List.of("Unagi", "Chocolate Cake", "Chocolate Cake", "4 Seasons"));
        List<String> t125 = new ArrayList<>(List.of("4 Seasons", "Unagi", "Tonkotsu Ramen", "Unagi", "Salad Wrap", "Unagi"));
        List<String> t126 = new ArrayList<>(List.of("Unagi", "Gyudon"));
        List<String> t127 = new ArrayList<>(List.of("Unagi"));
        List<String> t128 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap"));
        List<String> t129 = new ArrayList<>(List.of("Unagi", "Salad Wrap", "Rainbow Roll", "Tonkotsu Ramen", "Unagi"));
        List<String> t130 = new ArrayList<>(List.of("Tonkotsu Ramen"));
        List<String> t131 = new ArrayList<>(List.of("Gyudon", "Rainbow Roll"));
        List<String> t132 = new ArrayList<>(List.of("All Fried Sushi Platter", "4 Seasons", "4 Seasons"));
        List<String> t133 = new ArrayList<>(List.of("Gyudon", "Unagi"));
        List<String> t134 = new ArrayList<>(List.of("Unagi", "Gyudon", "All Fried Sushi Platter", "Tonkotsu Ramen"));
        List<String> t135 = new ArrayList<>(List.of("Tonkotsu Ramen", "All Fried Sushi Platter", "All Fried Sushi Platter", "Unagi", "Unagi"));
        List<String> t136 = new ArrayList<>(List.of("Unagi", "Rainbow Roll"));
        List<String> t137 = new ArrayList<>(List.of("Unagi", "Unagi", "Salad Wrap"));
        List<String> t138 = new ArrayList<>(List.of("Unagi"));
        List<String> t139 = new ArrayList<>(List.of("Salad Wrap", "Rainbow Roll", "Salad Wrap", "Chocolate Cake", "Unagi", "Unagi"));
        List<String> t140 = new ArrayList<>(List.of("Chocolate Cake", "Tonkotsu Ramen"));
        List<String> t141 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Rainbow Roll"));
        List<String> t142 = new ArrayList<>(List.of("Unagi", "4 Seasons", "Unagi"));
        List<String> t143 = new ArrayList<>(List.of("Chocolate Cake", "Rainbow Roll", "Gyudon", "All Fried Sushi Platter", "Unagi", "Unagi", "4 Seasons"));
        List<String> t144 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter", "Unagi", "Tonkotsu Ramen"));
        List<String> t145 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen"));
        List<String> t146 = new ArrayList<>(List.of("Rainbow Roll", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t147 = new ArrayList<>(List.of("Gyudon", "Tonkotsu Ramen", "Rainbow Roll", "Tonkotsu Ramen"));
        List<String> t148 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t149 = new ArrayList<>(List.of("Tonkotsu Ramen", "Gyudon", "Unagi", "Rainbow Roll", "Tonkotsu Ramen"));
        List<String> t150 = new ArrayList<>(List.of("Gyudon", "4 Seasons", "Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t151 = new ArrayList<>(List.of("4 Seasons"));
        List<String> t152 = new ArrayList<>(List.of("Gyudon", "Chocolate Cake", "Salad Wrap", "Rainbow Roll", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t153 = new ArrayList<>(List.of("Tonkotsu Ramen", "Salad Wrap"));
        List<String> t154 = new ArrayList<>(List.of("All Fried Sushi Platter", "Unagi"));
        List<String> t155 = new ArrayList<>(List.of("4 Seasons", "Unagi", "All Fried Sushi Platter", "Gyudon", "Chocolate Cake", "Chocolate Cake"));
        List<String> t156 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen", "4 Seasons", "Gyudon", "4 Seasons", "All Fried Sushi Platter"));
        List<String> t157 = new ArrayList<>(List.of("Chocolate Cake", "Salad Wrap", "Chocolate Cake", "Rainbow Roll", "Salad Wrap", "Unagi"));
        List<String> t158 = new ArrayList<>(List.of("Gyudon", "All Fried Sushi Platter", "Unagi", "Gyudon", "All Fried Sushi Platter"));
        List<String> t159 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter", "Chocolate Cake", "Salad Wrap"));
        List<String> t160 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "4 Seasons"));
        List<String> t161 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Rainbow Roll", "4 Seasons"));
        List<String> t162 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "All Fried Sushi Platter"));
        List<String> t163 = new ArrayList<>(List.of("Rainbow Roll", "Rainbow Roll"));
        List<String> t164 = new ArrayList<>(List.of("Chocolate Cake", "Salad Wrap", "All Fried Sushi Platter", "Salad Wrap"));
        List<String> t165 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tonkotsu Ramen"));
        List<String> t166 = new ArrayList<>(List.of("Chocolate Cake", "Salad Wrap", "4 Seasons", "Salad Wrap", "Gyudon", "All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t167 = new ArrayList<>(List.of("Tonkotsu Ramen", "All Fried Sushi Platter", "Salad Wrap", "Chocolate Cake", "4 Seasons", "Chocolate Cake"));
        List<String> t168 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter", "Gyudon", "Chocolate Cake", "Chocolate Cake"));
        List<String> t169 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap", "Unagi"));
        List<String> t170 = new ArrayList<>(List.of("Unagi", "Unagi", "Gyudon", "4 Seasons", "Rainbow Roll", "Chocolate Cake", "Gyudon"));
        List<String> t171 = new ArrayList<>(List.of("Salad Wrap", "Rainbow Roll", "Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t172 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "4 Seasons", "All Fried Sushi Platter", "Tonkotsu Ramen", "Unagi", "Chocolate Cake"));
        List<String> t173 = new ArrayList<>(List.of("Unagi", "Unagi"));
        List<String> t174 = new ArrayList<>(List.of("All Fried Sushi Platter", "Salad Wrap"));
        List<String> t175 = new ArrayList<>(List.of("Unagi"));
        List<String> t176 = new ArrayList<>(List.of("Unagi", "Unagi"));
        List<String> t177 = new ArrayList<>(List.of("Unagi", "Salad Wrap"));
        List<String> t178 = new ArrayList<>(List.of("Unagi", "4 Seasons"));
        List<String> t179 = new ArrayList<>(List.of("Rainbow Roll", "Unagi"));
        List<String> t180 = new ArrayList<>(List.of("Gyudon", "4 Seasons", "Rainbow Roll"));
        List<String> t181 = new ArrayList<>(List.of("Rainbow Roll", "Tonkotsu Ramen"));
        List<String> t182 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter"));
        List<String> t183 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t184 = new ArrayList<>(List.of("Chocolate Cake", "Gyudon", "Unagi", "Salad Wrap", "Gyudon", "Chocolate Cake"));
        List<String> t185 = new ArrayList<>(List.of("All Fried Sushi Platter", "Rainbow Roll"));
        List<String> t186 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t187 = new ArrayList<>(List.of("Unagi", "All Fried Sushi Platter"));
        List<String> t188 = new ArrayList<>(List.of("4 Seasons", "Chocolate Cake", "Tonkotsu Ramen", "Unagi", "Rainbow Roll", "Unagi"));
        List<String> t189 = new ArrayList<>(List.of("All Fried Sushi Platter", "Chocolate Cake", "Tonkotsu Ramen", "Rainbow Roll", "Unagi", "4 Seasons", "All Fried Sushi Platter"));
        List<String> t190 = new ArrayList<>(List.of("Unagi", "4 Seasons", "4 Seasons"));
        List<String> t191 = new ArrayList<>(List.of("Unagi", "Tonkotsu Ramen", "Chocolate Cake"));
        List<String> t192 = new ArrayList<>(List.of("Salad Wrap", "4 Seasons", "Rainbow Roll", "Rainbow Roll", "All Fried Sushi Platter", "Chocolate Cake"));
        List<String> t193 = new ArrayList<>(List.of("Rainbow Roll", "Tonkotsu Ramen"));
        List<String> t194 = new ArrayList<>(List.of("Rainbow Roll", "4 Seasons", "All Fried Sushi Platter"));
        List<String> t195 = new ArrayList<>(List.of("Salad Wrap", "Unagi", "Tonkotsu Ramen", "Unagi", "Tonkotsu Ramen", "Tonkotsu Ramen"));
        List<String> t196 = new ArrayList<>(List.of("Unagi", "4 Seasons"));
        List<String> t197 = new ArrayList<>(List.of("Unagi", "Rainbow Roll", "Tonkotsu Ramen", "Salad Wrap", "All Fried Sushi Platter", "Rainbow Roll"));
        List<String> t198 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t199 = new ArrayList<>(List.of("Unagi", "Rainbow Roll", "Chocolate Cake", "Unagi", "Chocolate Cake", "4 Seasons"));
        List<String> t200 = new ArrayList<>(List.of("Unagi", "Rainbow Roll", "Chocolate Cake"));
        List<String> t201 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki"));
        List<String> t202 = new ArrayList<>(List.of("All Fried Sushi Platter", "Royal", "Royal"));
        List<String> t203 = new ArrayList<>(List.of("Tendon", "Salad Wrap", "Miso Ramen", "Salad Wrap", "Chocolate Cake", "Ika"));
        List<String> t204 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t205 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter"));
        List<String> t206 = new ArrayList<>(List.of("Ika", "Miso Ramen", "Tendon"));
        List<String> t207 = new ArrayList<>(List.of("Miso Ramen"));
        List<String> t208 = new ArrayList<>(List.of("Royal"));
        List<String> t209 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter", "Ika", "Ika"));
        List<String> t210 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika"));
        List<String> t211 = new ArrayList<>(List.of("Ika", "Salad Wrap", "All Fried Sushi Platter", "Tuna Tataki", "Ika"));
        List<String> t212 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Chocolate Cake", "Royal", "Miso Ramen"));
        List<String> t213 = new ArrayList<>(List.of("Royal", "All Fried Sushi Platter"));
        List<String> t214 = new ArrayList<>(List.of("Ika", "Royal"));
        List<String> t215 = new ArrayList<>(List.of("Ika", "Miso Ramen", "Miso Ramen", "Ika", "Salad Wrap", "Chocolate Cake"));
        List<String> t216 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Tendon", "Chocolate Cake", "Ika", "Salad Wrap"));
        List<String> t217 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Chocolate Cake"));
        List<String> t218 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter", "Chocolate Cake", "Royal"));
        List<String> t219 = new ArrayList<>(List.of("All Fried Sushi Platter", "Royal"));
        List<String> t220 = new ArrayList<>(List.of("Ika"));
        List<String> t221 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika"));
        List<String> t222 = new ArrayList<>(List.of("Tendon", "Chocolate Cake", "Ika", "Salad Wrap", "Ika"));
        List<String> t223 = new ArrayList<>(List.of("Ika", "Tendon", "Miso Ramen"));
        List<String> t224 = new ArrayList<>(List.of("Tendon", "Miso Ramen", "Chocolate Cake", "Miso Ramen", "Ika"));
        List<String> t225 = new ArrayList<>(List.of("Ika", "Ika", "Miso Ramen"));
        List<String> t226 = new ArrayList<>(List.of("Salad Wrap", "Ika"));
        List<String> t227 = new ArrayList<>(List.of("Miso Ramen", "Royal", "Ika"));
        List<String> t228 = new ArrayList<>(List.of("Miso Ramen", "Royal", "All Fried Sushi Platter", "Miso Ramen"));
        List<String> t229 = new ArrayList<>(List.of("Tendon"));
        List<String> t230 = new ArrayList<>(List.of("Miso Ramen"));
        List<String> t231 = new ArrayList<>(List.of("Chocolate Cake", "All Fried Sushi Platter", "All Fried Sushi Platter", "Ika", "Ika", "All Fried Sushi Platter", "Tuna Tataki"));
        List<String> t232 = new ArrayList<>(List.of("All Fried Sushi Platter", "Chocolate Cake", "Royal"));
        List<String> t233 = new ArrayList<>(List.of("Miso Ramen", "Ika", "Tendon", "Tuna Tataki"));
        List<String> t234 = new ArrayList<>(List.of("Tendon"));
        List<String> t235 = new ArrayList<>(List.of("Ika", "Ika", "Miso Ramen", "Miso Ramen"));
        List<String> t236 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t237 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Miso Ramen", "Miso Ramen", "Ika"));
        List<String> t238 = new ArrayList<>(List.of("Salad Wrap", "Chocolate Cake", "Ika", "Chocolate Cake", "Salad Wrap", "Salad Wrap", "Ika"));
        List<String> t239 = new ArrayList<>(List.of("Chocolate Cake", "Tendon", "Royal", "Salad Wrap", "Ika", "Miso Ramen"));
        List<String> t240 = new ArrayList<>(List.of("Salad Wrap", "Chocolate Cake", "Royal", "Tuna Tataki", "Tuna Tataki"));
        List<String> t241 = new ArrayList<>(List.of("Tendon", "Miso Ramen"));
        List<String> t242 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki"));
        List<String> t243 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Salad Wrap", "Tuna Tataki", "Ika", "Salad Wrap"));
        List<String> t244 = new ArrayList<>(List.of("Miso Ramen", "Chocolate Cake", "Royal"));
        List<String> t245 = new ArrayList<>(List.of("Salad Wrap", "Royal", "Ika"));
        List<String> t246 = new ArrayList<>(List.of("Tendon", "All Fried Sushi Platter"));
        List<String> t247 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Royal", "Ika", "Ika", "Tendon", "All Fried Sushi Platter"));
        List<String> t248 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t249 = new ArrayList<>(List.of("All Fried Sushi Platter", "Salad Wrap", "Miso Ramen", "Tuna Tataki", "Ika"));
        List<String> t250 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap", "Tuna Tataki", "Tendon", "Tuna Tataki", "Chocolate Cake"));
        List<String> t251 = new ArrayList<>(List.of("Tuna Tataki", "Tendon", "All Fried Sushi Platter", "Tuna Tataki", "Ika"));
        List<String> t252 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Royal"));
        List<String> t253 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter", "Chocolate Cake", "Tendon", "Royal", "Tendon"));
        List<String> t254 = new ArrayList<>(List.of("All Fried Sushi Platter", "Salad Wrap", "Salad Wrap", "Ika", "Miso Ramen", "Chocolate Cake"));
        List<String> t255 = new ArrayList<>(List.of("Tuna Tataki"));
        List<String> t256 = new ArrayList<>(List.of("Ika"));
        List<String> t257 = new ArrayList<>(List.of("Salad Wrap", "Ika", "Tendon", "Salad Wrap", "Tuna Tataki"));
        List<String> t258 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter", "Ika"));
        List<String> t259 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "All Fried Sushi Platter", "Tendon", "Ika"));
        List<String> t260 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter"));
        List<String> t261 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Tuna Tataki", "All Fried Sushi Platter"));
        List<String> t262 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter"));
        List<String> t263 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Salad Wrap", "Chocolate Cake"));
        List<String> t264 = new ArrayList<>(List.of("Ika", "Miso Ramen", "Salad Wrap", "Chocolate Cake", "Salad Wrap", "Salad Wrap"));
        List<String> t265 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter", "Salad Wrap", "Tendon", "Salad Wrap", "Tendon"));
        List<String> t266 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Royal", "Ika", "All Fried Sushi Platter"));
        List<String> t267 = new ArrayList<>(List.of("Tuna Tataki", "Miso Ramen", "Ika", "Royal", "Royal", "Royal"));
        List<String> t268 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap", "Chocolate Cake", "All Fried Sushi Platter"));
        List<String> t269 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Miso Ramen", "Royal", "Royal"));
        List<String> t270 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Miso Ramen", "All Fried Sushi Platter"));
        List<String> t271 = new ArrayList<>(List.of("Tendon"));
        List<String> t272 = new ArrayList<>(List.of("Tendon", "Tuna Tataki", "Tuna Tataki", "All Fried Sushi Platter"));
        List<String> t273 = new ArrayList<>(List.of("Chocolate Cake", "Royal", "Miso Ramen", "Tuna Tataki", "Chocolate Cake"));
        List<String> t274 = new ArrayList<>(List.of("Tendon", "All Fried Sushi Platter", "Ika", "Chocolate Cake", "Chocolate Cake"));
        List<String> t275 = new ArrayList<>(List.of("Ika", "Salad Wrap", "Miso Ramen", "Ika", "Miso Ramen"));
        List<String> t276 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t277 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki", "Ika", "Chocolate Cake", "All Fried Sushi Platter"));
        List<String> t278 = new ArrayList<>(List.of("Tendon", "Chocolate Cake", "Ika", "Miso Ramen", "Miso Ramen"));
        List<String> t279 = new ArrayList<>(List.of("Ika", "Tendon", "Miso Ramen"));
        List<String> t280 = new ArrayList<>(List.of("Salad Wrap", "Ika"));
        List<String> t281 = new ArrayList<>(List.of("Royal", "Ika"));
        List<String> t282 = new ArrayList<>(List.of("Ika", "Salad Wrap", "Miso Ramen", "Tendon", "Royal", "Tendon"));
        List<String> t283 = new ArrayList<>(List.of("Tuna Tataki", "Miso Ramen", "Miso Ramen", "Tendon"));
        List<String> t284 = new ArrayList<>(List.of("Salad Wrap", "Miso Ramen", "Ika", "Salad Wrap", "Royal", "Royal", "Tuna Tataki"));
        List<String> t285 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Ika"));
        List<String> t286 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika"));
        List<String> t287 = new ArrayList<>(List.of("Tuna Tataki", "Miso Ramen", "Ika", "Miso Ramen", "Miso Ramen", "Tendon", "Royal"));
        List<String> t288 = new ArrayList<>(List.of("Tendon", "Tuna Tataki"));
        List<String> t289 = new ArrayList<>(List.of("Chocolate Cake", "Tendon", "Salad Wrap"));
        List<String> t290 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t291 = new ArrayList<>(List.of("Tendon", "Miso Ramen", "Tendon", "All Fried Sushi Platter", "Tendon"));
        List<String> t292 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t293 = new ArrayList<>(List.of("Salad Wrap", "Chocolate Cake", "All Fried Sushi Platter"));
        List<String> t294 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Tuna Tataki", "Royal", "Ika", "Salad Wrap"));
        List<String> t295 = new ArrayList<>(List.of("All Fried Sushi Platter", "Chocolate Cake", "Ika", "All Fried Sushi Platter", "Tuna Tataki", "All Fried Sushi Platter"));
        List<String> t296 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki", "Tendon", "Miso Ramen", "Chocolate Cake"));
        List<String> t297 = new ArrayList<>(List.of("Royal"));
        List<String> t298 = new ArrayList<>(List.of("Royal", "All Fried Sushi Platter", "Salad Wrap"));
        List<String> t299 = new ArrayList<>(List.of("Royal", "Ika", "Royal"));
        List<String> t300 = new ArrayList<>(List.of("Miso Ramen", "Ika", "Miso Ramen", "Miso Ramen"));
        List<String> t301 = new ArrayList<>(List.of("All Fried Sushi Platter", "Miso Ramen"));
        List<String> t302 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki", "Ika", "Ika", "Royal", "Tuna Tataki", "Salad Wrap"));
        List<String> t303 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t304 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap"));
        List<String> t305 = new ArrayList<>(List.of("Tuna Tataki", "Tuna Tataki", "Royal", "Tuna Tataki", "Miso Ramen", "Salad Wrap"));
        List<String> t306 = new ArrayList<>(List.of("All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t307 = new ArrayList<>(List.of("Ika", "Ika", "Ika"));
        List<String> t308 = new ArrayList<>(List.of("Tuna Tataki", "Royal", "Chocolate Cake", "Chocolate Cake"));
        List<String> t309 = new ArrayList<>(List.of("Ika", "Tuna Tataki"));
        List<String> t310 = new ArrayList<>(List.of("Tuna Tataki", "Tuna Tataki"));
        List<String> t311 = new ArrayList<>(List.of("Chocolate Cake", "Royal", "All Fried Sushi Platter"));
        List<String> t312 = new ArrayList<>(List.of("Salad Wrap", "Tendon", "Tendon", "All Fried Sushi Platter"));
        List<String> t313 = new ArrayList<>(List.of("Ika"));
        List<String> t314 = new ArrayList<>(List.of("Royal", "Chocolate Cake", "Ika", "Ika"));
        List<String> t315 = new ArrayList<>(List.of("Ika", "Ika", "All Fried Sushi Platter", "Royal", "Ika", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t316 = new ArrayList<>(List.of("Tuna Tataki"));
        List<String> t317 = new ArrayList<>(List.of("Miso Ramen", "Tendon", "Royal", "Salad Wrap", "Miso Ramen", "Ika"));
        List<String> t318 = new ArrayList<>(List.of("Tuna Tataki", "Tendon", "Royal", "Ika", "Ika"));
        List<String> t319 = new ArrayList<>(List.of("Miso Ramen", "Ika"));
        List<String> t320 = new ArrayList<>(List.of("Tuna Tataki", "Tuna Tataki"));
        List<String> t321 = new ArrayList<>(List.of("Chocolate Cake", "Tuna Tataki", "Salad Wrap", "Miso Ramen"));
        List<String> t322 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap"));
        List<String> t323 = new ArrayList<>(List.of("Ika", "Chocolate Cake", "Ika", "Ika", "Ika", "Miso Ramen"));
        List<String> t324 = new ArrayList<>(List.of("Miso Ramen", "Miso Ramen", "Ika", "Miso Ramen", "All Fried Sushi Platter", "All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t325 = new ArrayList<>(List.of("Tuna Tataki", "All Fried Sushi Platter", "Ika", "Ika", "Royal"));
        List<String> t326 = new ArrayList<>(List.of("Ika", "Tendon", "Tendon", "Ika"));
        List<String> t327 = new ArrayList<>(List.of("Ika", "Ika", "All Fried Sushi Platter"));
        List<String> t328 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap"));
        List<String> t329 = new ArrayList<>(List.of("Miso Ramen", "All Fried Sushi Platter", "Chocolate Cake", "Salad Wrap", "Miso Ramen", "Tuna Tataki"));
        List<String> t330 = new ArrayList<>(List.of("Ika", "Miso Ramen"));
        List<String> t331 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap"));
        List<String> t332 = new ArrayList<>(List.of("Royal", "Miso Ramen"));
        List<String> t333 = new ArrayList<>(List.of("Miso Ramen", "Ika"));
        List<String> t334 = new ArrayList<>(List.of("Miso Ramen", "Tuna Tataki", "Royal", "Miso Ramen", "Tuna Tataki", "Royal"));
        List<String> t335 = new ArrayList<>(List.of("Tendon", "All Fried Sushi Platter", "Miso Ramen", "Salad Wrap", "Royal", "Royal", "Salad Wrap"));
        List<String> t336 = new ArrayList<>(List.of("Chocolate Cake", "Tuna Tataki", "Salad Wrap", "Miso Ramen", "Ika", "Tuna Tataki"));
        List<String> t337 = new ArrayList<>(List.of("Chocolate Cake", "Tendon"));
        List<String> t338 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Chocolate Cake"));
        List<String> t339 = new ArrayList<>(List.of("Ika"));
        List<String> t340 = new ArrayList<>(List.of("Miso Ramen", "Ika", "All Fried Sushi Platter", "All Fried Sushi Platter", "Chocolate Cake", "Ika", "Ika"));
        List<String> t341 = new ArrayList<>(List.of("Ika", "Ika", "Salad Wrap", "Royal", "Ika", "Royal"));
        List<String> t342 = new ArrayList<>(List.of("Chocolate Cake", "All Fried Sushi Platter", "All Fried Sushi Platter", "Tuna Tataki", "Salad Wrap", "Miso Ramen", "Royal"));
        List<String> t343 = new ArrayList<>(List.of("Salad Wrap", "Royal"));
        List<String> t344 = new ArrayList<>(List.of("Miso Ramen", "Ika", "Ika", "Salad Wrap", "Royal", "Ika", "Tendon"));
        List<String> t345 = new ArrayList<>(List.of("Tuna Tataki", "Ika"));
        List<String> t346 = new ArrayList<>(List.of("Tuna Tataki", "Royal", "Royal", "Royal", "Ika", "Ika"));
        List<String> t347 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t348 = new ArrayList<>(List.of("Royal"));
        List<String> t349 = new ArrayList<>(List.of("Royal", "Miso Ramen", "Ika", "Ika"));
        List<String> t350 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t351 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tuna Tataki"));
        List<String> t352 = new ArrayList<>(List.of("Tendon", "Tendon"));
        List<String> t353 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t354 = new ArrayList<>(List.of("Royal", "Ika"));
        List<String> t355 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tuna Tataki", "Miso Ramen"));
        List<String> t356 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "Chocolate Cake", "Chocolate Cake", "Tuna Tataki"));
        List<String> t357 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Tuna Tataki", "Miso Ramen", "Ika", "Tendon"));
        List<String> t358 = new ArrayList<>(List.of("Royal", "Salad Wrap", "Ika", "Ika", "All Fried Sushi Platter", "Chocolate Cake"));
        List<String> t359 = new ArrayList<>(List.of("Tendon", "Salad Wrap", "Chocolate Cake", "Tuna Tataki", "Miso Ramen", "Ika", "Miso Ramen"));
        List<String> t360 = new ArrayList<>(List.of("Miso Ramen", "Ika"));
        List<String> t361 = new ArrayList<>(List.of("Ika", "Chocolate Cake", "Ika", "Salad Wrap", "Salad Wrap"));
        List<String> t362 = new ArrayList<>(List.of("Salad Wrap", "Miso Ramen"));
        List<String> t363 = new ArrayList<>(List.of("Miso Ramen", "Chocolate Cake", "Ika", "Ika", "All Fried Sushi Platter"));
        List<String> t364 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika"));
        List<String> t365 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t366 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t367 = new ArrayList<>(List.of("Miso Ramen", "Ika", "Ika", "Miso Ramen", "All Fried Sushi Platter", "Salad Wrap"));
        List<String> t368 = new ArrayList<>(List.of("Royal", "Ika", "Salad Wrap", "Chocolate Cake", "All Fried Sushi Platter", "Tendon"));
        List<String> t369 = new ArrayList<>(List.of("Chocolate Cake", "Tuna Tataki"));
        List<String> t370 = new ArrayList<>(List.of("All Fried Sushi Platter", "Miso Ramen"));
        List<String> t371 = new ArrayList<>(List.of("All Fried Sushi Platter", "Royal", "Tendon", "Salad Wrap", "Royal", "Ika"));
        List<String> t372 = new ArrayList<>(List.of("Miso Ramen", "Tendon", "Royal", "Tuna Tataki", "Tendon"));
        List<String> t373 = new ArrayList<>(List.of("Ika"));
        List<String> t374 = new ArrayList<>(List.of("Tendon", "Salad Wrap"));
        List<String> t375 = new ArrayList<>(List.of("Chocolate Cake", "Tendon", "Royal"));
        List<String> t376 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika"));
        List<String> t377 = new ArrayList<>(List.of("Tendon", "Chocolate Cake", "Tuna Tataki", "Ika", "Royal", "Tuna Tataki"));
        List<String> t378 = new ArrayList<>(List.of("Ika"));
        List<String> t379 = new ArrayList<>(List.of("Salad Wrap", "Ika", "Chocolate Cake", "Tendon", "Tuna Tataki", "Ika", "Royal"));
        List<String> t380 = new ArrayList<>(List.of("Miso Ramen", "All Fried Sushi Platter"));
        List<String> t381 = new ArrayList<>(List.of("Tendon"));
        List<String> t382 = new ArrayList<>(List.of("Tuna Tataki", "Tendon", "All Fried Sushi Platter", "Ika", "Tuna Tataki", "Miso Ramen", "Ika"));
        List<String> t383 = new ArrayList<>(List.of("Ika", "Miso Ramen", "Salad Wrap", "Salad Wrap", "Tuna Tataki", "Tendon", "Ika"));
        List<String> t384 = new ArrayList<>(List.of("Salad Wrap", "Ika"));
        List<String> t385 = new ArrayList<>(List.of("Ika", "Miso Ramen"));
        List<String> t386 = new ArrayList<>(List.of("Royal", "Ika", "Chocolate Cake", "All Fried Sushi Platter", "Chocolate Cake", "Ika", "Chocolate Cake"));
        List<String> t387 = new ArrayList<>(List.of("Miso Ramen", "Salad Wrap"));
        List<String> t388 = new ArrayList<>(List.of("Miso Ramen", "Ika"));
        List<String> t389 = new ArrayList<>(List.of("Ika", "Salad Wrap"));
        List<String> t390 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tendon"));
        List<String> t391 = new ArrayList<>(List.of("Chocolate Cake", "Miso Ramen"));
        List<String> t392 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki", "Salad Wrap", "Tuna Tataki", "Salad Wrap", "Ika", "All Fried Sushi Platter"));
        List<String> t393 = new ArrayList<>(List.of("Ika"));
        List<String> t394 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Miso Ramen", "Salad Wrap", "Chocolate Cake", "All Fried Sushi Platter"));
        List<String> t395 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Ika"));
        List<String> t396 = new ArrayList<>(List.of("Royal", "Tendon", "Ika"));
        List<String> t397 = new ArrayList<>(List.of("Tendon", "Tendon", "Ika", "Chocolate Cake", "Miso Ramen", "Ika", "Ika"));
        List<String> t398 = new ArrayList<>(List.of("Salad Wrap", "Chocolate Cake", "Tendon", "Royal", "Ika"));
        List<String> t399 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter", "Miso Ramen"));
        List<String> t400 = new ArrayList<>(List.of("Ika", "Ika", "Ika", "Ika", "Ika"));
        List<String> t401 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Royal"));
        List<String> t402 = new ArrayList<>(List.of("Ika", "Chocolate Cake", "All Fried Sushi Platter", "Ika", "Ika", "Salad Wrap"));
        List<String> t403 = new ArrayList<>(List.of("Royal", "Royal", "Tendon", "Ika", "Tuna Tataki"));
        List<String> t404 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Royal"));
        List<String> t405 = new ArrayList<>(List.of("Ika", "Salad Wrap", "Ika", "Chocolate Cake", "Chocolate Cake"));
        List<String> t406 = new ArrayList<>(List.of("Chocolate Cake", "Tuna Tataki", "Tendon", "Ika", "Salad Wrap", "Salad Wrap", "Chocolate Cake"));
        List<String> t407 = new ArrayList<>(List.of("Tuna Tataki", "Ika"));
        List<String> t408 = new ArrayList<>(List.of("Ika", "Chocolate Cake"));
        List<String> t409 = new ArrayList<>(List.of("Tuna Tataki", "Chocolate Cake", "Ika", "Salad Wrap", "Ika", "Tuna Tataki"));
        List<String> t410 = new ArrayList<>(List.of("Miso Ramen"));
        List<String> t411 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Ika"));
        List<String> t412 = new ArrayList<>(List.of("Chocolate Cake", "Miso Ramen", "Tuna Tataki", "Royal", "Royal"));
        List<String> t413 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "All Fried Sushi Platter", "All Fried Sushi Platter", "Ika", "Miso Ramen"));
        List<String> t414 = new ArrayList<>(List.of("Royal", "Tuna Tataki", "Royal", "Chocolate Cake", "Tuna Tataki", "Royal", "All Fried Sushi Platter"));
        List<String> t415 = new ArrayList<>(List.of("Ika", "Royal", "Salad Wrap"));
        List<String> t416 = new ArrayList<>(List.of("Tendon"));
        List<String> t417 = new ArrayList<>(List.of("Chocolate Cake", "Tendon", "Ika", "Ika", "Tendon", "Miso Ramen", "Chocolate Cake"));
        List<String> t418 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Salad Wrap", "Tendon", "Salad Wrap", "Tendon"));
        List<String> t419 = new ArrayList<>(List.of("Ika", "Salad Wrap"));
        List<String> t420 = new ArrayList<>(List.of("Tendon", "All Fried Sushi Platter", "Ika", "All Fried Sushi Platter", "Miso Ramen", "Tendon"));
        List<String> t421 = new ArrayList<>(List.of("Royal", "Royal", "Miso Ramen", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t422 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t423 = new ArrayList<>(List.of("Tuna Tataki", "Ika", "Ika"));
        List<String> t424 = new ArrayList<>(List.of("Miso Ramen", "Salad Wrap", "Tuna Tataki", "Chocolate Cake"));
        List<String> t425 = new ArrayList<>(List.of("Miso Ramen", "All Fried Sushi Platter"));
        List<String> t426 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tuna Tataki"));
        List<String> t427 = new ArrayList<>(List.of("All Fried Sushi Platter", "Salad Wrap"));
        List<String> t428 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t429 = new ArrayList<>(List.of("All Fried Sushi Platter"));
        List<String> t430 = new ArrayList<>(List.of("Ika", "Ika", "Tendon", "Royal"));
        List<String> t431 = new ArrayList<>(List.of("All Fried Sushi Platter", "Tuna Tataki", "Ika", "Chocolate Cake"));
        List<String> t432 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap"));
        List<String> t433 = new ArrayList<>(List.of("Ika", "Miso Ramen"));
        List<String> t434 = new ArrayList<>(List.of("Tendon", "Tendon", "All Fried Sushi Platter", "Salad Wrap", "Ika", "Royal"));
        List<String> t435 = new ArrayList<>(List.of("Ika", "Ika", "Ika", "Ika"));
        List<String> t436 = new ArrayList<>(List.of("Tuna Tataki", "All Fried Sushi Platter"));
        List<String> t437 = new ArrayList<>(List.of("Miso Ramen", "Salad Wrap"));
        List<String> t438 = new ArrayList<>(List.of("Salad Wrap"));
        List<String> t439 = new ArrayList<>(List.of("Salad Wrap", "Ika"));
        List<String> t440 = new ArrayList<>(List.of("Tuna Tataki", "Ika"));
        List<String> t441 = new ArrayList<>(List.of("Chocolate Cake", "Miso Ramen", "Ika"));
        List<String> t442 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Ika"));
        List<String> t443 = new ArrayList<>(List.of("Tendon", "Royal"));
        List<String> t444 = new ArrayList<>(List.of("Chocolate Cake", "Chocolate Cake", "Tuna Tataki", "Miso Ramen"));
        List<String> t445 = new ArrayList<>(List.of("Chocolate Cake", "All Fried Sushi Platter", "All Fried Sushi Platter", "Ika"));
        List<String> t446 = new ArrayList<>(List.of("Tendon", "Royal"));
        List<String> t447 = new ArrayList<>(List.of("Salad Wrap", "Royal"));
        List<String> t448 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter"));
        List<String> t449 = new ArrayList<>(List.of("Tendon", "Ika"));
        List<String> t450 = new ArrayList<>(List.of("Salad Wrap", "Ika", "Chocolate Cake", "Royal", "Royal", "Tuna Tataki"));
        List<String> t451 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Miso Ramen", "Miso Ramen", "Ika"));
        List<String> t452 = new ArrayList<>(List.of("Salad Wrap", "Ika"));
        List<String> t453 = new ArrayList<>(List.of("Tendon", "Tuna Tataki"));
        List<String> t454 = new ArrayList<>(List.of("Miso Ramen", "Salad Wrap", "Ika", "Royal", "Chocolate Cake", "Tuna Tataki"));
        List<String> t455 = new ArrayList<>(List.of("Ika", "Salad Wrap"));
        List<String> t456 = new ArrayList<>(List.of("Ika", "Royal", "Chocolate Cake", "Miso Ramen", "Ika", "Royal", "Miso Ramen"));
        List<String> t457 = new ArrayList<>(List.of("Tuna Tataki", "All Fried Sushi Platter", "All Fried Sushi Platter", "Ika", "Tuna Tataki"));
        List<String> t458 = new ArrayList<>(List.of("Salad Wrap", "All Fried Sushi Platter", "Ika", "Royal", "Tuna Tataki", "Tendon"));
        List<String> t459 = new ArrayList<>(List.of("Royal", "Royal", "Salad Wrap", "Tendon", "Tendon", "Tuna Tataki", "Ika"));
        List<String> t460 = new ArrayList<>(List.of("Tendon", "Miso Ramen", "Ika", "All Fried Sushi Platter", "Royal", "Royal"));
        List<String> t461 = new ArrayList<>(List.of("Tendon", "Miso Ramen"));
        List<String> t462 = new ArrayList<>(List.of("Chocolate Cake", "Royal"));
        List<String> t463 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "All Fried Sushi Platter", "All Fried Sushi Platter", "Royal"));
        List<String> t464 = new ArrayList<>(List.of("Salad Wrap", "Salad Wrap", "Salad Wrap", "Tuna Tataki", "Ika"));
        List<String> t465 = new ArrayList<>(List.of("All Fried Sushi Platter", "Chocolate Cake", "All Fried Sushi Platter"));
        List<String> t466 = new ArrayList<>(List.of("Tuna Tataki"));
        List<String> t467 = new ArrayList<>(List.of("Royal", "All Fried Sushi Platter", "Tuna Tataki", "Ika", "All Fried Sushi Platter"));
        List<String> t468 = new ArrayList<>(List.of("Royal", "Ika", "Tendon"));
        List<String> t469 = new ArrayList<>(List.of("Tendon", "Ika", "Tendon", "Chocolate Cake", "Miso Ramen"));
        List<String> t470 = new ArrayList<>(List.of("Tendon", "Ika", "Tuna Tataki"));
        List<String> t471 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t472 = new ArrayList<>(List.of("Ika", "Royal", "Salad Wrap", "Tuna Tataki", "Ika", "Tuna Tataki"));
        List<String> t473 = new ArrayList<>(List.of("Salad Wrap", "Ika", "Ika", "Tuna Tataki", "Chocolate Cake"));
        List<String> t474 = new ArrayList<>(List.of("Miso Ramen"));
        List<String> t475 = new ArrayList<>(List.of("Ika", "Tuna Tataki", "Royal", "Ika", "Royal", "Ika", "Tendon"));
        List<String> t476 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "All Fried Sushi Platter", "Ika"));
        List<String> t477 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "All Fried Sushi Platter"));
        List<String> t478 = new ArrayList<>(List.of("Tuna Tataki", "Salad Wrap"));
        List<String> t479 = new ArrayList<>(List.of("Royal", "Ika", "Royal", "Ika", "Tendon", "Royal", "All Fried Sushi Platter"));
        List<String> t480 = new ArrayList<>(List.of("Tuna Tataki", "Miso Ramen", "Chocolate Cake", "Miso Ramen", "Royal", "Royal"));
        List<String> t481 = new ArrayList<>(List.of("Chocolate Cake", "Tendon"));
        List<String> t482 = new ArrayList<>(List.of("All Fried Sushi Platter", "Salad Wrap", "Royal", "Tuna Tataki"));
        List<String> t483 = new ArrayList<>(List.of("Royal"));
        List<String> t484 = new ArrayList<>(List.of("Chocolate Cake", "Ika", "Royal", "Ika", "Salad Wrap", "Salad Wrap", "All Fried Sushi Platter"));
        List<String> t485 = new ArrayList<>(List.of("Royal", "Salad Wrap", "Chocolate Cake", "Royal"));
        List<String> t486 = new ArrayList<>(List.of("Ika", "Ika"));
        List<String> t487 = new ArrayList<>(List.of("Chocolate Cake", "Tendon", "Royal", "Ika", "Tuna Tataki", "All Fried Sushi Platter"));
        List<String> t488 = new ArrayList<>(List.of("Ika", "Chocolate Cake", "Royal", "Ika", "Tuna Tataki"));
        List<String> t489 = new ArrayList<>(List.of("Tuna Tataki", "Miso Ramen", "Royal"));
        List<String> t490 = new ArrayList<>(List.of("Royal"));
        List<String> t491 = new ArrayList<>(List.of("Ika"));
        List<String> t492 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki", "Chocolate Cake"));
        List<String> t493 = new ArrayList<>(List.of("Tuna Tataki", "Ika"));
        List<String> t494 = new ArrayList<>(List.of("Miso Ramen", "Ika", "Tendon", "All Fried Sushi Platter", "Ika", "Tendon", "Salad Wrap"));
        List<String> t495 = new ArrayList<>(List.of("Ika", "All Fried Sushi Platter", "Chocolate Cake", "Royal", "Ika"));
        List<String> t496 = new ArrayList<>(List.of("Salad Wrap", "Tuna Tataki"));
        List<String> t497 = new ArrayList<>(List.of("Chocolate Cake"));
        List<String> t498 = new ArrayList<>(List.of("Tuna Tataki", "Ika"));
        List<String> t499 = new ArrayList<>(List.of("Miso Ramen", "Ika"));
        List<String> t500 = new ArrayList<>(List.of("All Fried Sushi Platter", "Ika", "All Fried Sushi Platter", "Ika", "Tendon", "Chocolate Cake"));

        Collections.addAll(transactionsTB,
                t1, t2, t3, t4, t5, t6, t7, t8, t9, t10,
                t11, t12, t13, t14, t15, t16, t17, t18, t19, t20,
                t21, t22, t23, t24, t25, t26, t27, t28, t29, t30,
                t31, t32, t33, t34, t35, t36, t37, t38, t39, t40,
                t41, t42, t43, t44, t45, t46, t47, t48, t49, t50,
                t51, t52, t53, t54, t55, t56, t57, t58, t59, t60,
                t61, t62, t63, t64, t65, t66, t67, t68, t69, t70,
                t71, t72, t73, t74, t75, t76, t77, t78, t79, t80,
                t81, t82, t83, t84, t85, t86, t87, t88, t89, t90,
                t91, t92, t93, t94, t95, t96, t97, t98, t99, t100,
                t101, t102, t103, t104, t105, t106, t107, t108, t109, t110,
                t111, t112, t113, t114, t115, t116, t117, t118, t119, t120,
                t121, t122, t123, t124, t125, t126, t127, t128, t129, t130,
                t131, t132, t133, t134, t135, t136, t137, t138, t139, t140,
                t141, t142, t143, t144, t145, t146, t147, t148, t149, t150,
                t151, t152, t153, t154, t155, t156, t157, t158, t159, t160,
                t161, t162, t163, t164, t165, t166, t167, t168, t169, t170,
                t171, t172, t173, t174, t175, t176, t177, t178, t179, t180,
                t181, t182, t183, t184, t185, t186, t187, t188, t189, t190,
                t191, t192, t193, t194, t195, t196, t197, t198, t199, t200,
                t201, t202, t203, t204, t205, t206, t207, t208, t209, t210,
                t211, t212, t213, t214, t215, t216, t217, t218, t219, t220,
                t221, t222, t223, t224, t225, t226, t227, t228, t229, t230,
                t231, t232, t233, t234, t235, t236, t237, t238, t239, t240,
                t241, t242, t243, t244, t245, t246, t247, t248, t249, t250,
                t251, t252, t253, t254, t255, t256, t257, t258, t259, t260,
                t261, t262, t263, t264, t265, t266, t267, t268, t269, t270,
                t271, t272, t273, t274, t275, t276, t277, t278, t279, t280,
                t281, t282, t283, t284, t285, t286, t287, t288, t289, t290,
                t291, t292, t293, t294, t295, t296, t297, t298, t299, t300,
                t301, t302, t303, t304, t305, t306, t307, t308, t309, t310,
                t311, t312, t313, t314, t315, t316, t317, t318, t319, t320,
                t321, t322, t323, t324, t325, t326, t327, t328, t329, t330,
                t331, t332, t333, t334, t335, t336, t337, t338, t339, t340,
                t341, t342, t343, t344, t345, t346, t347, t348, t349, t350,
                t351, t352, t353, t354, t355, t356, t357, t358, t359, t360,
                t361, t362, t363, t364, t365, t366, t367, t368, t369, t370,
                t371, t372, t373, t374, t375, t376, t377, t378, t379, t380,
                t381, t382, t383, t384, t385, t386, t387, t388, t389, t390,
                t391, t392, t393, t394, t395, t396, t397, t398, t399, t400,
                t401, t402, t403, t404, t405, t406, t407, t408, t409, t410,
                t411, t412, t413, t414, t415, t416, t417, t418, t419, t420,
                t421, t422, t423, t424, t425, t426, t427, t428, t429, t430,
                t431, t432, t433, t434, t435, t436, t437, t438, t439, t440,
                t441, t442, t443, t444, t445, t446, t447, t448, t449, t450,
                t451, t452, t453, t454, t455, t456, t457, t458, t459, t460,
                t461, t462, t463, t464, t465, t466, t467, t468, t469, t470,
                t471, t472, t473, t474, t475, t476, t477, t478, t479, t480,
                t481, t482, t483, t484, t485, t486, t487, t488, t489, t490,
                t491, t492, t493, t494, t495, t496, t497, t498, t499, t500
                );
        for (List<String> transaction : transactionsTB) {
            Set<String> filteredTransactions = new LinkedHashSet<>(transaction);
            transaction.clear();
            transaction.addAll(filteredTransactions);
        }

    }
}
