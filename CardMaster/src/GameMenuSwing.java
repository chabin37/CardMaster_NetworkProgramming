import javax.swing.*;
import java.awt.*;

public class GameMenuSwing extends JFrame {

    private int points = 120220;

    public GameMenuSwing() {
        // 기본 프레임 설정
        setTitle("Game Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout());

        // 상단 패널 (핑크색 배경)
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(new Color(242, 212, 215));
        topPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 웰컴 메시지
        JLabel welcomeLabel = new JLabel("Chabin 님, 환영합니다.");
        welcomeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.WHITE);
        topPanel.add(welcomeLabel, BorderLayout.WEST);

        // 포인트 표시
        JLabel pointsLabel = new JLabel("잔액: " + String.format("%,d", points) + " points");
        pointsLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
        pointsLabel.setForeground(Color.WHITE);
        pointsLabel.setBackground(new Color(128, 128, 128));
        pointsLabel.setOpaque(true);
        pointsLabel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        topPanel.add(pointsLabel, BorderLayout.EAST);

        // 메인 컨텐츠 패널
        JPanel contentPanel = new JPanel(new GridLayout(1, 3, 20, 0));
        contentPanel.setBackground(Color.WHITE);
        contentPanel.setBorder(BorderFactory.createEmptyBorder(40, 40, 40, 40));

        // 블랙잭 게임 카드 3개 생성
        for (int i = 0; i < 3; i++) {
            contentPanel.add(createGameCard());
        }

        // 프레임에 패널 추가
        add(topPanel, BorderLayout.NORTH);
        add(contentPanel, BorderLayout.CENTER);

        // 중앙에 표시
        setLocationRelativeTo(null);
    }

    private JPanel createGameCard() {
        JPanel card = new JPanel();
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
        card.setBackground(new Color(242, 212, 215));
        card.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 게임 제목
        JLabel titleLabel = new JLabel("BLACKJACK");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 플레이어 수
        JLabel playersLabel = new JLabel("4 명 플레이중");
        playersLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 14));
        playersLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // 참여 버튼
        JButton joinButton = new JButton("참여하기");
        joinButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        joinButton.setBackground(Color.WHITE);
        joinButton.setFocusPainted(false);
        joinButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "게임 참여 버튼이 클릭되었습니다."));

        // 컴포넌트 간 간격 추가
        card.add(Box.createVerticalGlue());
        card.add(titleLabel);
        card.add(Box.createVerticalStrut(10));
        card.add(playersLabel);
        card.add(Box.createVerticalStrut(20));
        card.add(joinButton);
        card.add(Box.createVerticalGlue());

        return card;

    }
}