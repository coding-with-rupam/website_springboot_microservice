document.addEventListener('DOMContentLoaded', function () {
    const videoList = document.getElementById('video-list');

    fetch('http://localhost:8080/api/videos')  // Ensure this matches your backend endpoint
        .then(response => response.json())
        .then(data => {
            data.forEach(video => {
                const videoElement = document.createElement('div');
                videoElement.innerHTML = `
                    <h3>${video.title}</h3>
                    <iframe width="560" height="315"
                            src="https://www.youtube.com/embed/${video.youtubeId}"
                            frameborder="0"
                            allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
                            allowfullscreen>
                    </iframe>
                    <p>${video.description}</p>
                `;
                videoList.appendChild(videoElement);
            });
        })
        .catch(error => console.error('Error fetching videos:', error));
});
