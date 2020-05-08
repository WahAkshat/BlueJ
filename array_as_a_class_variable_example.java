

public class array_as_a_class_variable_example
{
  int a[] ;
    public void  sampleMethod()
    {
        
       this.a = new int []{1,2,3};
        System.out.println(a[1]);
    }
}
