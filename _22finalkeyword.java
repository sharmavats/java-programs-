public class _22finalkeyword {
    final int speedlimit=90;// final variable
    void run(){
    speedlimit=400;   //speed limit can't be changed as it is assigned final 
    }
    
    public static void main(String[] args) {
    _22finalkeyword obj = new _22finalkeyword();
    obj.run();
    }
}
