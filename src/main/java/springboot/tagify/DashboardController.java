package springboot.tagify;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
public class DashboardController {

    @GetMapping("/stats")
    public Map<String, Object> getDashboardStats() {
        Map<String, Object> stats = new HashMap<>();
        stats.put("totalImagesProcessed", 1234567);
        stats.put("uniqueTagsGenerated", 98765);
        stats.put("averageTagsPerImage", 7.5);
        stats.put("classificationAccuracy", 95.6);
        return stats;
    }

    @GetMapping("/chart-data")
    public Map<String, Object> getChartData() {
        Map<String, Object> chartData = new HashMap<>();
        chartData.put("labels", new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"});
        chartData.put("data", new int[]{12000, 19000, 15000, 17000, 22000, 18000, 20000});
        return chartData;
    }
}