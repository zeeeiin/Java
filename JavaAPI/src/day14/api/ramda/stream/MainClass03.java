package day14.api.ramda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass03 {

	public static void main(String[] args) {

		List<Integer> list  = new ArrayList<>();
		Random ran = new Random();

		for(int i = 0; i < 100; i++) {

			list.add( ran.nextInt(100) +1 ); //1~100까지
		}

		System.out.println( list.toString() );


		//최종집계 함수 collect()		
		//Collectors.toList(); //collect타입 반환.
		//list.stream().filter( a -> a % 3 == 0).collect( Collectors.toList());
		//list 타입으로 변환 >>이 괄호()안에 들어가는 타입에 맞춰서 변환하는 것.

		List<Integer> newList = list.stream().filter( a -> a % 3 == 0).collect( Collectors.toList());		
		System.out.println( newList.toString() ); //3의 배수를 필터링한 결과

		Set<Integer> newList2 = list.stream().filter( a -> a %3 == 0).collect( Collectors.toSet() ); //반환이 set 인티저 타입.
		System.out.println( newList2.toString() ); //set타입으로 반환된 걸 볼 수 있다.


		System.out.println("----------------------------------------------------------------------------");

		//sum(), count(), avg(), max(), min() - 집계함수, 숫자를 다루는 스트림에서만 사용
		//정수나 double형 스트림으로 변경해야 사용 가능하다.
		//list.stream().distinct().mapToInt( a -> a +10 ); //기존배열에 10이 더해짐. 이제 sum 사용 가능
		int r1 = list.stream().distinct().mapToInt( a -> a ).sum(); //~을 제거하고 그 합계를 구한다.
		System.out.println("합계:" + r1);

		long r2 = list.stream().distinct().mapToInt(a -> a).count();
		System.out.println("개수:" + r2);

		OptionalDouble r3 = list.stream().distinct().mapToInt(a -> a).average();
		//System.out.println("평균:" + r3); //r3이라고 입력하면 주소값이 나온다. 그렇기 때문에 get 함수로 일반형으로 가져오기.
		System.out.println( r3.getAsDouble()); //옵셔널 더블형에서 더블값 반환.

		OptionalInt r4 = list.stream().distinct().mapToInt(a -> a).max();
		System.out.println( r4.getAsInt() );

		System.out.println("----------------------------------------------------------------------------");

		//list에서 50보다 큰 값만 중복없이 저장하는 새로운 리스트를 생성하시오.		
		List<Integer> result = list.stream()
								   .distinct()
								   .filter( t -> t >= 50 )
								   .collect( Collectors.toList() );
							
		//마지막타입의 최종반환 = 스트림.중복제거.필터링.최종집계
		//ex. t 타입으로 들어와서 false로 나간다.

		System.out.println(result.toString());

		System.out.println("----------------------------------------------------------------------------");

		//정수 스트림
		IntStream.range(1, 10).forEach(a -> System.out.println(a)); //미만까지 정수 스트림 반환
		//IntStream 타입으로 받을 수 있다. 1~10미만까지의 값을 가지고 있는 (반복)형태.
		IntStream.rangeClosed(1, 10).forEach(a -> System.out.println(a)); //포함 정수 스트림 반환
		
		int result2 = IntStream.rangeClosed(1, 100).sum();
		System.out.println( result2 );
		
		
		//정수스트림 -> 일반스트림 형변환
		Stream<Integer> stream = IntStream.rangeClosed(1, 100).boxed();
		//list 에 집어넣을 줄만 알면 됨 ...
		
		


	}
}
