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
 * 	新写代码以后，如果需要，我们可以为新写的代码，创建新的分支来保存；
 * 	项目右键==>[team]==>[switch to]==>[new branch]==>自定义新分支的名字==>[finish]
 * 
 * 	新分支(mynewbranch)开发完成之后，如果想要合并到主分支master上:
 * 		1.项目要切换到主分支上：
 * 			项目右键==>[team]==>[switch to]==>[master]
 * 		2.分支合并(这一步只完成了在本地合并，服务器上并没有合并):
 * 			项目右键==>[team]==>[Merge]
 * 			有对话框弹出:
 * 				选择要把哪个分支合并到当前分支上（这里选择mynewbranch）;
 * 			在新弹出的对话框中，选择master主分支，点[add...]
 * 			点[force update...]==>【finish】
 * 		3.合并后的master提交到服务器保存
 * 			项目右键==>【team】==>【Remote】==>【push】
 * 			
 * 
 * 
 * 
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
