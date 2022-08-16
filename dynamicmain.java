package Stck;
public class dynamicmain {
    public static void main(String[] args) {
        fixedLength f=new fixedLength(15);
        dynamicstack d=new dynamicstack(5);
        stackk iStack;
        iStack=f;
        System.out.println("Conetnt of Fixed stack");
        for(int i=0;i<15;i++){
            f.push((char)('A'+i));
        }
        for(int i=0;i<15;i++){
            System.out.println(f.pop()+"\t");
        }
        iStack=d;
        System.out.println("Contents of Dynamic stack");
        for(int i=0;i<25;i++){
            d.push((char)('A'+i));
        }
        for(int i=0;i<25;i++){
            System.out.println(d.pop()+"\t");
        }
    }
}

