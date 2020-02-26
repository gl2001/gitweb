package cn.sz.gl.no1;
/**
 * 1.客户端，必须先更新（pull）,再提交(commit and push)
 * 2.再提交的时候，不要全项目一起提交，写了哪个文件，就只提交哪个文件;
 * 
 * 
 * 当服务器上代码与eclipse里面代码不一致的时候，此时eclipse里面更新服务器(pull的时候)，会出现pull失败;
 * 此时：
 * 	1.需要先把eclipse里面的代码commit到本地git库（C:\Users\Administrator\git\gitweb\src\cn\sz\gl\no1）；
 * 	2.再次从服务器上，pull代码到本地，此时会体现冲突：
 * 		列举服务器上代码与eclipse里面代码不一致的地方
 * 		这里需要我们人为解决冲突；
 * 	3.解决完冲突，我们再次重新提交代码，此时就可以把本地自己新写的代码同步到服务器了，本地库也同时得到更新;
 * 
 * 
 * @author Administrator
 *
 */
public class Hello {

	public void show() {
		System.out.println("hello");
		System.out.println("world");
		System.out.println("你好");
		System.out.println("2222222");
		System.out.println("1111111");

	}
}
