package tree.easy;

public class BInaryTreeArrayImp {

    static int parent=0;
    static String[] str= new String[10];

//    Create Root

    public void parant(String key){
        str[0]=key;
    }

    //    create left of root
    public void set_left(String key,int parent){

        int left=(parent*2)+1;

        if(str[parent]==null){
            System.out.println("can't set the child at %d , no parent found");
        }else{
            str[left]=key;
        }

    }



//    Create Right of root
    public void set_right(String key,int parent){

        int right=(parent*2)+2;

        if(str[parent]==null){
            System.out.println("can't set the child at %d , no parent found");
        }else{
            str[right]=key;
        }

    }
    
    
    public void printTree(){
        System.out.println(str.length);
        for (int i = 0; i < str.length ; i++) {
            if(str[i]!=null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
        
    }
}
