package pl.urbanskilukasz.carRent.model.dto;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Builder
public class RentalDto {
    private long userId;
    private long carId;
}
