package day08.basic;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// ArrayList : 巷薦廃 壕伸 ( 段奄 鯵呪 : 10牒 --> 戚板稽 10牒梢 潅嬢蟹澗 依戚 奄沙 )
// LinkedList : 尻衣軒什闘 莫殿 

class Pokemon {
	String name;
	int level;
	Pokemon(String name, int level){
		this.name = name;
		this.level = level;
	}
	public String toString() { // Object廃砺 弘形閤製
		return "[" + name + ", lv." + level + "]";
	}
}
public class Test01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		
		// 据社 蓄亜 : add(Object 歯据社)
		
		// 据社 諮脊 : add(index 是帖, Object 歯据社)
		
		list.add(1); 
		list.add(3.14); 
		list.add(new Pokemon("杷朝鋳", 10));
		list.add(1, "ABC"); 
		System.out.println(list.toString());
		
		
		// 据社 左奄 : Object get(int 昔畿什) 
		//  = index腰 据社 襖鎧奄 
		Integer e1 = (Integer)list.get(0);
		System.out.println(e1);
		
		Pokemon p = (Pokemon)list.get(3);
		System.out.println(p);
		
		// 据社 呪舛(企端) : set(int index, Object newElement)
		// index腰 据社研 歯 据社稽 企端
		list.set(2, "せせせ"); 
		System.out.println(list);
		
		// 据社 肢薦 : remove(int index)  : ~腰属 据社 肢薦 
		// 			remove(Object element) : ~研 肢薦
		
		// "せせせ" 走酔奄 
		// 号狛1. list.remove(2);
		// 号狛2. list.remove("せせせ"); 
		
		list.add(1000);
		System.out.println(list);
		
		list.remove( (Object)1000 ); 
		System.out.println(list);
		
		Integer i1 = new Integer(100); 
		Integer i2 = new Integer(100); 
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); // 匂舌梓端級精 硝戸戚(Value)亜 旭精 旭精 梓端 昼厭)
		
		// 据社 伊事 : boolean contains(Object 伊事拝 据社)
		boolean bool = list.contains("ABC"); 
		System.out.println(bool); // true
		
		// 陥献 但壱(鎮刑芝)櫛 佐杯 : addAll(Collection 陥献但壱) 
		LinkedList list2 = new LinkedList();
		list2.add('亜');
		list2.add('蟹');
		list2.add('陥');
		
		list.addAll(list2);
		System.out.println(list); 
		// [1, ABC, せせせ, [杷朝鋳, lv.10], 亜, 蟹, 陥]

		// 据社 是帖 達奄 : int indexOf(Object 据社)
		int index = list.indexOf('亜'); 
		System.out.println(index); // 4
		
		System.out.println(list.size()); // 7 (薄仙 据社 鯵呪)
		
		// 壕伸稽 幻級奄 : Object[] toArray()
		Object[] arr = list.toArray();
		
		Object[] arr2 = new Object[ list.size() ];
		list.toArray(arr2); 
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		
 		// Iterator 条嬢神奄 : iterator() 
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// ==> for庚 左陥 疏陥 
		for(int i = 0; i < list.size(); ++i) {
			System.out.println( list.get(i) );
		}
		
		// 乞砧 肢薦 : clear()
		list.clear();
		System.out.println(list); // []
	}
}










