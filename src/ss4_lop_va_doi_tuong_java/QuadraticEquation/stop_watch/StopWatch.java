package lop_va_doi_tuong_java.QuadraticEquation.stop_watch;

public class StopWatch {
public static void main(){

    int a =0;
    int b =0;
    int fibo;
    for (int i = 0; i <=20 ; i++) {
        fibo =a+b;
        a=b;
        b=fibo;
        System.out.println(fibo);
    }
    }
}
//    let fibo;
//    document.write(a +'||'+b+'||')
//            for (let i =0;i<=18;i++){
//            fibo =a+b;
//            a=b;
//            b=fibo;
//            document.write(fibo +'||');
//            }
