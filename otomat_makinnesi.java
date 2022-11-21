import java.util.Scanner;
public class otomat_makinnesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int kola=10,gazoz=10,cips=5,kraker=3,cikolata=5,ent,credit=0,rePay=0;

        boolean isTrue=false;

        while(!isTrue){
            System.out.print("Para girişi yapın:\nÇıkış için -1 yazın basın:");
            System.out.print("-Mevcut Kredi:"+credit+"-");
            credit = inp.nextInt();



            if (credit==-1){
                System.out.println("Sistemden çıkış yapıldı.");
                System.exit(0);
            }


            System.out.print("Bir sayı girin:\n1=kola,2=gazoz,3=cips,4=kraker,5=çikolata\nÇıkış için 6 ya basın.");
            System.out.print("Kredi="+credit);
            ent =inp.nextInt();

            while(ent>=1&&ent<=5){
                switch (ent){
                    case 1:
                        if(credit-kola>=0){
                            int a=(credit-kola);
                            System.out.println("Afiyet olsun!\nPara üstünüz:"+a);
                            boolean inTrue=true;
                            ent=ent+10;
                            rePay=credit-kola;
                            break;
                        }
                        else{
                            System.out.println("Yetersiz Kredi!");
                            ent=ent+10;
                            break;
                        }
                    case 2:
                        if(credit-gazoz>=0){
                            int a=(credit-gazoz);
                            System.out.println("Afiyet olsun!\nPara üstünüz:"+a);
                            ent=ent+10;
                            rePay=credit-gazoz;
                            break;
                        }
                        else{
                            System.out.println("Yetersiz Kredi!");
                            ent=ent+10;
                            break;
                        }
                    case 3:
                        if(credit-cips>=0){
                            int a=(credit-cips);
                            System.out.println("Afiyet olsun!\nPara üstünüz:"+a);
                            ent=ent+10;
                            rePay=credit-cips;
                            break;
                        }
                        else{
                            System.out.println("Yetersiz Kredi!");
                            ent=ent+10;
                            break;
                        }
                    case 4:
                        if(credit-kraker>=0){
                            int a=(credit-kraker);
                            System.out.println("Afiyet olsun!\nPara üstünüz:"+a);
                            ent=ent+10;
                            rePay=credit-kraker;
                            break;
                        }
                        else{
                            System.out.println("Yetersiz Kredi!");
                            ent=ent+10;
                            break;
                        }
                    case 5:
                        if(credit-cikolata>=0){
                            int a=(credit-cikolata);
                            System.out.println("Afiyet olsun!\nPara üstünüz:"+a);
                            ent=ent+10;
                            rePay=credit-cikolata;
                            break;
                        }
                        else{
                            System.out.println("Yetersiz Kredi!");
                            ent=ent+10;
                            break;
                        }
                }
            }
        }
    }
}
