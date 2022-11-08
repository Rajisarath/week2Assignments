package week3.day2ass;

public class Automation extends AbsclsMultipleLangauge implements Language,TestTool {

	public void Java() {
		System.out.println("interface-->java langauge");
		
	}

	public void Selenium() {
		System.out.println("interface-->Selenium langauge");
		
		
	}

	@Override
	public void ruby() {
		System.out.println("abstractunimple--->ruby langauge");
		
	}
	public static void main(String[] args) {
		Automation auto=new Automation();
		System.out.println("--------Automation class-------");
		auto.Java();
		auto.Selenium();
		auto.ruby();
		System.out.println("--------AbsclsMultipleLangauge-------");
		auto.python();
		
		

		
	}

}
