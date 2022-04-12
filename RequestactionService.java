package dao;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;import com.model.Requestaction;

	@Service
	public class RequestactionService {
		@Autowired
		Requestaction Requestactiondaoimpl;
		public void logRequest(Requestaction action) {
			Requestactiondaoimpl.logrequest(action);
		}
		public Requestaction addAction(int id) {
			return Requestactiondaoimpl.addRequest(id);
			
		}
		public List<Requestaction> addAllaction() {
			return Requestactiondaoimpl.addAllRequest();
		}
		public boolean reviewaction(Requestaction action) {
			return Requestactiondaoimpl.reviewrequest(action);
		}
		public boolean accessaction(Requestaction action) {
			return Requestactiondaoimpl.accessaction(action);
		}
	}

}
