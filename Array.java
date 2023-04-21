/* wajp to find sum and average of given elements in array.  */


class Array
{
public static void main(String args[])
{
int num[]={75,65,85,45,95};

double sum=0.0, avg=0.0;
for(int i=0; i<num.length; i++){
sum=sum+num[i];
avg=sum/num.length;
}
System.out.println("sum ="+sum);
System.out.println("avg ="+avg);

}
}