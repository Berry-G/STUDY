package variablea;

public class TestSelectionSort
{
	public static void main(String[] args)
	{
		System.out.println("Selection Sort (선택 정렬)\n");
		int[] keyA = { 30, 29, 20, 1, 50, 40, 33, 17, 19, 21 };
		
		System.out.println("정렬 전 인덱스");
		print_arry(keyA, 10);
		
		selection_sort(keyA, 10); // keyA 정렬
		System.out.println("\n\n정렬 후 인덱스");
		print_arry(keyA, 10);
	}

	public static void selection_sort(int[] a)
	{
		selection_sort(a, a.length);
	}

	private static void selection_sort(int[] a, int size)
	{

		for (int i = 0; i < size - 1; i++)
		{
			int min_index = i;

			// 최솟값을 갖고있는 인덱스 찾기
			for (int j = i + 1; j < size; j++)
			{
				if (a[j] < a[min_index])
				{
					min_index = j;
				}
			}

			// i번째 값과 찾은 최솟값을 서로 교환
			swap(a, min_index, i);
		}
	}

	private static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	private static void print_arry(int[] key, int num)
	{
		for (num = 0; num < 10; num++)
		{
			System.out.printf("%d ", key[num]);
		}		
	}
}