import java.util.Iterator;

public class sapXepChon implements SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int n = arr.length;
		int i,j,min;
		for( i = 0 ; i < n-1; i++) {
			min = i;
			for(j = i + 1; j < n ; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			double temp;
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			
			
		}
		
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int n = arr.length;
		int i,j,max;
		for( i = 0 ; i < n-1; i++) {
			max = i;
			for(j = i + 1; j < n ; j++) {
				if(arr[j]>arr[max]) {
					max = j;
				}
			}
			double temp;
			temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}
		
	}

}
