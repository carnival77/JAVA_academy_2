package day06.basic;
/*
 * < java.lang.System 適掘什 >
 * - 錘慎端薦(獣什奴) 淫恵 適掘什
 * 
 * - 琶球 :  
 * 	1) in : cmd(嬬車)人 尻衣鞠嬢赤澗 脊径 什闘顕
 *  2) out : cmd人 尻衣鞠嬢赤澗 窒径 什闘顕
 *  3) err : cmd人 尻衣鞠嬢赤澗 窒径 什闘顕(拭君 五獣走研 鎧左鎧澗 搾雌 搭稽)
 */
public class Test01 {
	public static void main(String[] args) {
		System.out.println("せせせせ"); // sysout
		System.err.println("ぞぞぞぞ"); // syserr
		
		long millis = System.currentTimeMillis();
		// 1970.1.1 切舛 ~ 走榎猿走 井引廃 腔軒段研 long生稽 硝形捜
		System.out.println(millis);
		
		for(int i = 0; i < 1000000; ++i) {
			System.out.println(i);
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-millis + "腔軒段");
	}
}










