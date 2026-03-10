package it.aredegalli.coachly.user.dto;

import it.aredegalli.coachly.user.enums.HeightUnit;
import it.aredegalli.coachly.user.enums.Theme;
import it.aredegalli.coachly.user.enums.WeightUnit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PreferencesDto {

    private UUID userId;
    private String locale;
    private String timezone;
    private Theme theme;
    private WeightUnit preferredWeightUnit;
    private HeightUnit preferredHeightUnit;
    private String notificationSettings;
}
