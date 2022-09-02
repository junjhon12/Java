
public class problemNineteen {

	public static void main(String[] args) {
		//Holds Joe paid amount for stock
		double paidStock = (1000*32.87);
		//Holds the amount for stockbrocker first time
		double stockBrckerBuy = (paidStock*0.02);
		
		//Holds Joe sold amount for stock
		double soldStock = (1000*33.92);
		//Holds the amount for stockbrocker second time
		double stockBrckerSell = (soldStock*0.02);
		
		//Displays amount paid, sold, commission for brocker ,and whether ot not he made profit
		System.out.println("Amount paid: " + paidStock + '\n' +
							"Amount commission to brocker when brought: " + stockBrckerBuy + '\n' +
							"Amount sold: " + soldStock + '\n' +
							"Amount commission to brocker when sold: " + stockBrckerSell + '\n' +
							"Profit: " + ((soldStock - stockBrckerSell) - (paidStock - stockBrckerBuy)));

	}

}
