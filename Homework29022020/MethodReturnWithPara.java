package Homework29022020;

public class MethodReturnWithPara {
    public static void main(String[] args) {
        MethodReturnWithPara p = new
                MethodReturnWithPara();//object creation
//System.out.println(p.MethodReturnWithPar(10,20));//printing statement
        int sub = p.MethodReturnWithPar(10, 20);//passing parameter
        System.out.println(sub);//printing statement

        String fullName = p.MethodReturnWithParam("Pruv","Patel");//passing parameter
        System.out.println(fullName);//printing statement
    }
    //return type int method with 2 parameter
    public int MethodReturnWithPar(int a, int b) {
        int sub;//total addition of sum
        sub = a + b;//addition sub
        return sub;//returning sub
    }
    // return type string method with 2 parameter
    public String MethodReturnWithParam(String Pruv, String
            Patel) {
        String fullName;//joining 2 name reference
        fullName = Pruv + "" + Patel; // joining 2 name
        return fullName;//returning full name
    }
}
