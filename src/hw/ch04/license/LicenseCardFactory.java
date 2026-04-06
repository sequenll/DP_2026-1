package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

import java.time.LocalDate;

public class LicenseCardFactory extends Factory{
    private int licenseCounter = 100;
    String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String holder) {
        LocalDate issued = LocalDate.parse(baseDate);   // 발급일
        LocalDate expiry = issued.plusYears(5);
        return new LicenseCard(holder, licenseCounter++, baseDate, expiry.toString());
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
