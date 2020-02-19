package com.cap.lab.excercise1;

 abstract class Item {

	 private int id_no;
	 private String book_title;
	 private int no_of_copies;
	
	
	public Item(int id_no,String book_title,int no_of_copies) {
		this.setId_no(id_no);
		this.book_title=book_title;
		this.no_of_copies=no_of_copies;
		
	}
	public String toString()
	{
		return "id"+getId_no()+"Book Title:"+book_title+"No of Copies:"+no_of_copies;
    }
	public int getId_no() {
		return id_no;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	public void setId_no(int id_no) {
		this.id_no = id_no;
	}

 }	
	
	abstract class WrittenItem extends Item
	{
		private String author_name;
		
		public WrittenItem(int id_no, String book_title, int no_of_copies ,String author_name) {
			super(id_no, book_title, no_of_copies);
			this.author_name=author_name;
		}

		public String getAuthor_name() {
			return author_name;
		}

		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}
	
		public String toString()
		{
			return "Author Name:"+author_name;
	    }
		
	}
	
	class Book extends WrittenItem
	{

		public Book(int id_no, String book_title, int no_of_copies,String author_name) {
			super(id_no, book_title, no_of_copies,author_name);
		}
		
	}
	
	class JournalPaper extends WrittenItem
	{
		

		private int year_published;
		
		public JournalPaper(int id_no, String book_title, int no_of_copies, String author_name) {
			super(id_no, book_title, no_of_copies, author_name);
			
		}

		

		public int getYear_published() {
			return year_published;
		}

		public void setYear_published(int year_published) {
			this.year_published = year_published;
		}
		
		public String toString()
		{
			return "year_of_published"+year_published;
		}
	}
	
	abstract class MediaItem extends Item
	{

		private int runTime;
		public MediaItem(int id_no, String book_title, int no_of_copies) {
			super(id_no, book_title, no_of_copies);
		}
		public int getRunTime() {
			return runTime;
		}
		public void setRunTime(int runTime) {
			this.runTime = runTime;
		}
		
		public String toString()
		{
			return "RunTime :"+runTime;
		}
	 	
	}

	class Vedio extends MediaItem
	{
		private String director_name;
		private int year_release;
		private String genre;
		
		public Vedio(int id_no, String book_title, int no_of_copies,String director_name,int year_release,String genre) {
			super(id_no, book_title, no_of_copies);
			this.director_name=director_name;
			this.genre=genre;
			this.year_release=year_release;
		}
		
		
		public String getDirector_name() {
			return director_name;
		}
		public void setDirector_name(String director_name) {
			this.director_name = director_name;
		}
		public int getYear_release() {
			return year_release;
		}
		public void setYear_release(int year_release) {
			this.year_release = year_release;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public String toString()
		{
			return "Director Name:"+director_name+ "Year Of Release :"+ year_release;
		}
	}
	
	
	class CD extends MediaItem
	{
		private String artist;
		private String genre;
		
		public CD(int id_no, String book_title, int no_of_copies,String artist,String genre) {
			super(id_no, book_title, no_of_copies);

			this.artist=artist;
			this.genre=genre;
		}
			
		public String getArtist() {
			return artist;
		}
		public void setArtist(String artist) {
			this.artist = artist;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public String toString()
		{
			return "Artist: "+artist+"Genre: "+genre+"Id no:"+super.getId_no()+"No of Copies :"+super.getNo_of_copies();
		}
		
	}
	
	 class Library
	 {
		 public static void main(String[] args)
		 {
		 Item item=new CD(1,"ja",30,"at","comedy");
		 System.out.println(item);
		 }
	 }