class Books {
    private String bookName;
    private String authorName;
    private int year;
    private double amount;

    // Book Name
    public void setBookName(String bookName) throws IllegalArgumentException {
        if (bookName.equals("")) {
            throw new IllegalArgumentException("You Missed Book Name");
        } else {
            this.bookName = bookName;
        }
    }

    public String getBookName() {
        return bookName;
    }

    // Author Name
    public void setAuthorName(String authorName) throws IllegalArgumentException {
        if(authorName.isEmpty()) {
            throw new IllegalArgumentException("You Missed Author Name");
        } else {
            this.authorName = authorName;
        }
    }

    public String getAuthorName() {
        return authorName;
    }

    // Year
    public void setYear(int year) throws IllegalArgumentException {
        if(year == 0) {
            throw new IllegalArgumentException("Don't Pass Zero");
        } else if(year < 0) {
            throw new IllegalArgumentException("Don't pass negative numbers");
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    // Amount
    public void setAmount(double amount) throws IllegalArgumentException {
        if(amount < 0.0) {
            throw new IllegalArgumentException("Don't Enter negative value");
        } else {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }
}
