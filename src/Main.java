/**
 *
 * @author
 * @since
 */
public class Main {
    //密码，长度要是8的倍数    注意此处为简单密码  简单应用 要求不高时可用此密码
/*DES是一种对称加密算法，所谓对称加密算法即：加密和解密使用相同密钥的算法。DES加密算法出自IBM的研究，
后来被美国政府正式采用，之后开始广泛流传，但是近些年使用越来越少，因为DES使用56位密钥，以现代计算能力，
24小时内即可被破解。*/
    //测试
    public static void main(String args[]) {
        //待加密内容
        String str = "zhifa";
        String password = "nmf^3^-x";
        String result = DESUtil.encrypt(str,password);
        System.out.println("加密后："+result);
        //直接将如上内容解密
        try {
            String decryResult = DESUtil.decryptor(result,password);
            System.out.println("解密后："+new String(decryResult));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

}
