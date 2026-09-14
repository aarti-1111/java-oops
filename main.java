class main {
public static void main(String[] args) {
        
    
    int a = 6;   // 0110
    int b = 3;   // 0011

    System.out.println(a & b); // 1 (0001)
    System.out.println(a|b);  
    System.out.println(a^b);  
    System.out.println(~a);          
    System.out.println(~b);  
    System.out.println(a>>1);
    System.out.println(b>>1); 
    System.out.println(a<<5);
}
}