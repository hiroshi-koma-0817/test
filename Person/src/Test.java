
public class Test {

	public static void main(String[] args) {
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="090-9999-0000";
		jiro.address="ブラジル";
		jiro.bloodtype="B型";
		jiro.talk();
		jiro.walk();
		jiro.run();
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		System.out.print(jiro.bloodtype);

		Person hana=new Person();
		hana.name="鈴木花子";
		hana.age=16;
		hana.phoneNumber="080-8888-7777";
		hana.address="コスタリカ";
		hana.bloodtype="AB型";
		hana.talk();
		hana.walk();
		hana.run();
		System.out.println(hana.name);
		System.out.println(hana.age);
		System.out.println(hana.phoneNumber);
		System.out.println(hana.address);
		System.out.println(hana.bloodtype);

		Person hiro=new Person();
		hiro.name="駒ヒロシ";
		hiro.age=22;
		hiro.phoneNumber="080-0909-0909";
		hiro.address="ウルグアイ";
		hiro.bloodtype="A型";
		hiro.talk();
		hiro.walk();
		hiro.run();
		System.out.println(hiro.name);
		System.out.println(hiro.age);
		System.out.println(hiro.phoneNumber);
		System.out.println(hiro.address);
		System.out.println(hiro.bloodtype);

		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println(aibo.name);

		Robot asim=new Robot();
		asim.name="asimo";
		asim.talk();
		asim.walk();
		asim.run();
		System.out.println(asim.name);

		Robot pepp=new Robot();
		pepp.name="pepper";
		pepp.talk();
		pepp.walk();
		pepp.run();
		System.out.println(pepp.name);

		Robot dora=new Robot();
		dora.name="doraemon";
		dora.talk();
		dora.walk();
		dora.run();
		System.out.println(dora.name);




	}

}
