/**
 * Created by Seven on 05.04.2014.
 */
public class Menu {
    private MenuItem[] arr;
    private int count;
    public void Show()
    {
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i].Name);
        }
    }
    public Menu()
    {
        count=0;
        arr = new MenuItem[2];
    }
    public void Add(MenuItem item)
    {
        if(count==arr.length) {
            MenuItem[] tmp = new MenuItem[arr.length*2];
            for(int i=0;i<tmp.length;i++)
            {
                tmp[i]=arr[i];
            }
            arr=tmp;
        }
        arr[count]=item;
        count++;
    }

    public void Clear()
    {
        count=0;
        arr = new MenuItem[2];
    }
}
