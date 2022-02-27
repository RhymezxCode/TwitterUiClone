attribute vec2 vs_Position;

varying vec3 fs_RayDir;

uniform mat4 viewMatrix;
uniform float nearPlane;
uniform float aspectRatio;
uniform float mirrored;

void main() {
  vec2 viewportPos = vs_Position * 2.0 - 1.0;
  fs_RayDir = (viewMatrix * vec4(viewportPos.xy * vec2(aspectRatio, -1.0), nearPlane, 0.0)).xyz;
  gl_Position = vec4(viewportPos * vec2(mirrored, -1.0), 0.0, 1.0);
}
