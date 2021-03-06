package code_03_Object;

/**
 * 重写equals()方法
 - 检查是否为同一个对象的引用，如果是直接返回 true；
 - 检查是否是同一个类型，如果不是，直接返回 false；
 - 将 Object 对象进行转型；
 - 判断每个关键域是否相等。
 */
public class EqualExample {
    private int x;
    private int y;
    private int z;

    public EqualExample(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        // 检查是否为同一个对象的引用，如果是直接返回 true
        if(this==obj){
            return true;
        }
        //检查是否是同一个类型，如果不是，直接返回 false；
        if(obj==null || obj.getClass()!=this.getClass()){
            return false;
        }
        //将 Object 对象进行转型
        EqualExample that=(EqualExample)obj;
        //判断每个关键域是否相等。
        if(that.x!=this.x){
            return false;
        }
        if(this.y!=this.y){
            return false;
        }
        return that.z==this.z;
    }
}
