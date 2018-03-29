package softLeader;

import java.util.List;

/**
上機考題: 計算人事成本
功能需求:
		這裡有一份某公司於2016年5月份的員工打卡紀錄，紀錄中有該員工當日的打卡時間與薪資時間
		請計算出每位員工應給予多少薪資
		
		根據美國勞基法規定，工時超過8小時後，加班費應依下列倍率計算
			第0~8小時給予基本薪資
			第8~12小時給予基本薪資X1.5倍
			第12小時開始給予基本薪資X2.0倍
<br>
本程式開發需求:
		5月份打卡資料的取得方式為呼叫TimeClockService.getData();
		計算每位員工的應付薪資後，請使用本class下的printSomebodyPay方法將結果顯示在console
<br>
答題提示:
	1.除了本試題的說明註解外(藍色註解部分)，你可以對這個程式的任何邏輯(含printSomebodyPay)做修改
	2.本程式所使用的日期時間物件為LocalDateTime，這是一個於jdk8後才引入的class
	  LocalDateTime有一套相關的api可以計算兩個時間的間距，請自行搜索
<br>
	若要測試程式是否可以運作，可以直接執行main方法
	
@author Rhys
*****本試題版權為松凌科技所有*****
**/
public class App {

	public static void main(String[] args) {
		final List<TimeClockEntity> TimeClockData = TimeClockService.getData();
		
	}

	public static void printSomebodyPay(String name , double pay){
		System.out.printf("%1$s    %2$.2f\n",name,pay);
	}
}
