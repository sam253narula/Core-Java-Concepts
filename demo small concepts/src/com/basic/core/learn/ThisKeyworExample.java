class ThisKeyworExample{
    int a,b;
    
        public void get(int a, int b){
            this.a = a;
            this.b = b;
        }
        public void disp(){
            System.out.println(a+" "+b);
        }
        public ThisKeyworExample greater(ThisKeyworExample e2){
            if(this.a>e2.a&&this.b>e2.b)
                return this;
            else
                return e2;
        }
        
         public static void main(String [] args){
        ThisKeyworExample e1 = new ThisKeyworExample();
        e1.get(29,50);
        ThisKeyworExample e2 = new ThisKeyworExample();
        e2.get(6,7);
        ThisKeyworExample e3;
        e3=e1.greater(e2);
        e3.disp();
    }
}