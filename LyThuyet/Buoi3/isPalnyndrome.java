public class isPalnyndrome {
        void main(){
            try {
                String S = IO.readln();
                int len = S.length();
                boolean isPalnyndrome = true;
                for (int i = 0; i < len / 2; i++){
                    if (S.charAt(i) != S.charAt(len - 1 - i)){
                        isPalnyndrome = false;
                        IO.println(S.charAt(i));
                        IO.println(S.charAt(len - 1 - i));
                        break;
                    }
                }
                if (isPalnyndrome){
                    IO.println("La Palnyndrome");
                }
                else{
                    IO.println("Khong Palnyndrome");
                }
            }
            catch (Exception e){
                IO.println("Loi khi xu ly");
            }
        }

}
