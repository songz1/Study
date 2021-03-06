/*
송지은_백준 알고리즘 2941번

문자열 길이만큼 for문 돌면서 순서대로 문자 확인
-> 일단 count++
-> 인덱스에 해당하는 문자 확인
-> 크로아티아 알파벳인지 확인
-> 맞으면 크로아티아 문자 개수만큼 건너뛰기
-> 틀리면 계속 진행
-> count 출력
*/

package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2941 {
	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String input = bufferedReader.readLine();

		int count = 0;
		char c;
		for (int i = 0; i < input.length(); i++) {
			c = input.charAt(i);
			count++;

			switch (c) {
				case 'c':
					if (i < input.length() - 1 && (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-')) {
						i++;
					}
					break;
				case 'd':
					if (i < input.length() - 1 && input.charAt(i + 1) == '-') {
						i++;
					} else if (i < input.length() - 2 && input.substring(i + 1, i + 3).equals("z=")) {
						i += 2;
					}
					break;
				case 'l':
					if (i < input.length() - 1 && input.charAt(i + 1) == 'j') {
						i++;
					}
					break;
				case 'n':
					if (i < input.length() - 1 && input.charAt(i + 1) == 'j') {
						i++;
					}
					break;
				case 's':
					if (i < input.length() - 1 && input.charAt(i + 1) == '=') {
						i++;
					}
					break;
				case 'z':
					if (i < input.length() - 1 && input.charAt(i + 1) == '=') {
						i++;
					}
					break;
				default:
					break;
			}
		}

		System.out.print(count);
	}
}
