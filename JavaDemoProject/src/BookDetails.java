public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Concept of Array
		Book[] myBook=new Book[2];
		
		int x=0;
		
		myBook[0]=new Book();
		myBook[1]=new Book();
		//Value on Specific Index
		myBook[0].book_name="Java Programming";
		myBook[1].book_name="Python Programming";
		
		myBook[0].book_id="J123";
		myBook[1].book_id="P123";
		
		while(x<myBook.length)
		{
			System.out.println(myBook[x].book_name);
			System.out.println(myBook[x].book_id);
			x=x+1;
		}

	}

}
