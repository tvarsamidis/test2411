package gr.codehub.mock.p05_exception_handling;

import java.time.LocalDate;
import java.util.Objects;

public class Phone {
    private String phoneId;
    private String model;
    private int price;
    private LocalDate releaseDate;

    public Phone() {
    }

    public Phone(String phoneId, String model, int price, LocalDate releaseDate) {
        this.phoneId = phoneId;
        this.model = model;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price &&
               Objects.equals(model, phone.model) &&
               Objects.equals(releaseDate, phone.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price, releaseDate);
    }
}
