
package ASSNT2;

/*
 * @author NASIR ALI BALOCH
 */
public class Mob {
    private float  S_size;
    private String color;
    public Mob()               //CONSTRACTOR NUMBER 1
    {
        S_size=5;
        color="purple";
    }
    public Mob(float S_size1,String color1)      //CONSTRACTOR NUMBER2
    {
        S_size=S_size1;
        color=color1;
    }
    public void setS_size(float S_size2)         //SETTER
    {
        S_size=S_size2;
    }
    public float getS_size(float S_size1)          //GETTER
    {
        return S_size;
    }
    public void setcolor(String color4)           //SETTER
    {
        color=color4;
    }
    public String getetcolor(String color5)      //GETTER
    {
        return color;
    }
    public void showMob()                      //FUNCTION SHOWMob
    {
        System.out.println("S_size is ="+S_size);
        System.out.println("color is="+color);
    }
    
}
