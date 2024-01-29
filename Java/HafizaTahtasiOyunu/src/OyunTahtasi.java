public class OyunTahtasi {

    public String oyunTahtasi (int x , int y){
        String [][] oyunTahta= new String[4][4];
        oyunTahta[0][0] = "a";oyunTahta[0][1] = "b";oyunTahta[0][2] = "c";oyunTahta[0][3] = "c";
        oyunTahta[1][0] = "d";oyunTahta[1][1] = "e";oyunTahta[1][2] = "g";oyunTahta[1][3] = "f";
        oyunTahta[2][0] = "h";oyunTahta[2][1] = "d";oyunTahta[2][2] = "b";oyunTahta[2][3] = "f";
        oyunTahta[3][0] = "g";oyunTahta[3][1] = "a";oyunTahta[3][2] = "h";oyunTahta[3][3] = "e";
        
        return oyunTahta[x][y];

    }

}
/*
-------------------------
|00 | <> |01 | <> |02 | <> |03 |
-------------------------
|10 | <> |11 | <> |12 | <> |13 |
-------------------------
|20 | <> |21 | <> |22 | <> |23 |
-------------------------
|30 | <> |31 | <> |32 | <> |33 |
-------------------------
*/