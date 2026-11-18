package com.bloodconnect.controller;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
@RestController @RequestMapping("/api/ai") @CrossOrigin(origins="http://localhost:5173")
public class AiController {
 private final ChatClient client;
 public AiController(ChatClient.Builder builder){client=builder.build();}
 @PostMapping("/chat") public Map<String,String> chat(@RequestBody Map<String,String> body){
  String q=body.getOrDefault("message","").trim();
  if(q.isBlank()) return Map.of("answer","Please enter a question.");
  try {
   String a=client.prompt().system("You are BloodConnect's platform assistant. Help with app usage only. Do not diagnose, prescribe, determine donor eligibility, or make definitive compatibility decisions. Refer medical and emergency questions to qualified hospital/blood-bank professionals. Never delay emergency care.")
    .user(q).call().content();
   return Map.of("answer",a==null?"No response generated.":a);
  } catch(Exception e) {
   return Map.of("answer","AI service is unavailable or not configured. Set OPENAI_API_KEY and restart. For urgent needs, contact a hospital or licensed blood bank.");
  }
 }
}
