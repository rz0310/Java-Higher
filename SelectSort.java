package SelectSort;

public class SelectSort {
	/*题目分析：
通过观察发现，本题目要实现把数组元素{13,46,22,65,3}进行排序
1. 提到数组排序，就要进行元素值大小的比较，通过上图发现，我们想完成排序要经过若干次的比较才能够完成。
2. 上图中用每圈要比较的第一个元素与该元素后面的数组元素依次比较到数组的最后一个元素，把小的值放在第一个数组元素中，数组循环一圈后，则把最小元素值互换到了第一个元素中。
3. 数组再循环一圈后，把第二小的元素值互换到了第二个元素中。按照这种方式，数组循环多圈以后，就完成了数组元素的排序。这种排序方式我们称为选择排序。
解题步骤：
1. 使用for循环（外层循环），指定数组要循环的圈数（通过图解可知，数组循环的圈数为数组长度 - 1）
2. 在每一圈中，通过for循环（内层循环）完成数组要比较的第一个元素与该元素后面的数组元素依次比较到数组的最后一个元素，把小的值放在第一个数组元素中
3. 在每一圈中，要参与比较的第一个元素由第几圈循环来决定。如上图所示
a) 进行第一圈元素比较时，要比较的第一个元素为数组第一个元素，即索引为0的元素
b) 进行第二圈元素比较时，要比较的第一个元素为数组第二个元素，即索引为1的元素
c) 依次类推，得出结论：进行第n圈元素比较时，要比较的第一个元素为数组第n个元素，即数组索引为n-1的元素*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{44,33,22,11};
		selectSort(arr);
	}
	public static void selectSort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
