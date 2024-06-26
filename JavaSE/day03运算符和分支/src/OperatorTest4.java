/**
 * @author XGLins
 * @date 2024/5/7 16:02
 *
 * 位运算符：按照二进制的每一位进行运算
 *      &:与  转为二进制后上下都为1 结果就是1
 *      |:或  转为二进制后上下有 1 则 1
 *      ^:异或  相同为0 不同为1
 *      ~:取反  0变1 1变0 拿到的就是补码
 *      <<:左移  左移几位 * 2^次幂
 *      >>:右移  右移一位除以2
 *      >>>:无符号右移  只要向右移动 无论是正数还是负数最高位都补0
 *
 * 注意：
 *      1.& | ^ 如果两边是布尔类型的表达式则代表的是逻辑运算符
 *              如果是数字则代表位运算符
 *
 */
class OperatorTest5 {

    public static void main(String[] args) {

        System.out.println("----------->>>----------------");
        System.out.println(6>>>1);//3
        /*
        11111111111111111111111111111010|
        01111111111111111111111111111101|

        */
        System.out.println(-6>>>1);//2147483645
        System.out.println(0B01111111111111111111111111111101);

        System.out.println("-----------<<----------------");
        /* 3 左移 2位
        |00000000 00000000 00000000 00000011
        |00000000 00000000 00000000 00001100
        */
        System.out.println(3 << 2);//12

        System.out.println("----------->>----------------");
        /* 3 右移 1位
        00000000 00000000 00000000 00000011|
        00000000 00000000 00000000 00000001|
        */
        System.out.println(3 >> 1);//1


    }
}


class OperatorTest4 {

    public static void main(String[] args) {

        System.out.println(true & false);//false 逻辑运算符
        /*
            1 0 1
         &    1 1
         ----------
            0 0 1
        */
        System.out.println(5 & 3);//1 位运算符
        /*
            0 1 0 1  --->5
         |  0 0 1 1  --->3
         ----------
            0 1 1 1  --->7
        */
        System.out.println(5|3);//7

       /*
            0 1 0 1  --->5
         ^  0 0 1 1  --->3
         ----------
            0 1 1 0  --->6
        */
        System.out.println(5^3);//6

        /*
          0000 0110

          补码：1111 1001
          反码：1111 1000
          源码：1000 0111

        */
        System.out.println(~6);//-7


    }

}
