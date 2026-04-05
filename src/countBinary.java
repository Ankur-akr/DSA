void main() {
    String s ="000111";
    int window = 2;
    int i=0 , j=1 , count= 0;
    while(i<window){
        if(s.charAt(i)==1){
            count++;
            i++;
        }
    }
}