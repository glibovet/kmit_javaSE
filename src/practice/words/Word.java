package practice.words;
public class Word {
	private String word;
	private int count;
	
	public Word(String word){
		this.word = word;
		this.count = 1;
	}
	
	public String getWord(){
		return this.word;
	}

	public int getCount(){
		return this.count;
	}
	
	public String toString(){
		return word+"-"+count;
	}
	
	public void addWord(){
		count++;
	}

}
