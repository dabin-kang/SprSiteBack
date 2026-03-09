package org.example.service;

import org.example.dto.MusicDto; // MusicDto를 인식하기 위해 필요합니다.
import org.springframework.stereotype.Service; // @Service를 인식하기 위해 필요합니다.
import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.WriteResult;

@Service
public class FirebaseService {

    public String saveMusic(MusicDto music) throws Exception {
        Firestore db = FirestoreClient.getFirestore();
        // Firebase의 'music' 컬렉션에 데이터를 저장하는 예시입니다.
        ApiFuture<WriteResult> collectionsApiFuture = db.collection("music").document(music.getTitle()).set(music);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
}